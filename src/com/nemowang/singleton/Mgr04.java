package com.nemowang.singleton;

/**
 * @Author Nemo Wong
 * @Date 2021/3/18 14:55
 * @Description 单例模式 懒汉式
 * 与饿汉式不同的是，懒汉式是在类第一次使用的时候才被初始化
 * 虽然达到了按需初始化的目的，但是也带来了线程不安全的问题
 * 可以通过synchronized解决，但也带来效率下降
 */
public class Mgr04 {
    private static Mgr04 INSTANCE;

    private Mgr04() {}

    /**
     * 加了synchronized
     * 因为是static的，锁定的是Mgr04.class
     * @return
     */
    public static synchronized Mgr04 getInstance() {
        if (INSTANCE == null) {
            // 初次调用，还没有实例化

            // 模拟多线程调度时间 和被其他线程打断的可能
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr04();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        // 验证懒汉式的线程不安全性
        for (int i = 0; i < 100 ; i++) {
            new Thread(()->
                    System.out.println(Mgr04.getInstance().hashCode())
            ).start();
        }
    }
}
