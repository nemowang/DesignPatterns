package com.nemowang.singleton;

/**
 * @Author Nemo Wong
 * @Date 2021/3/18 14:55
 * @Description 单例模式 懒汉式
 * 与饿汉式不同的是，懒汉式是在类第一次使用的时候才被初始化
 * 虽然达到了按需初始化的目的，但是也带来了线程不安全的问题
 * 可以通过synchronized解决，但也带来效率下降
 */
public class Mgr05 {
    private static Mgr05 INSTANCE;

    private Mgr05() {}

    public static Mgr05 getInstance() {
        if (INSTANCE == null) {
            /**
             * 使用同步代码块进行加锁，妄图通过减小同步代码块的方式提高效率，实际不可行
             * 不能保证只创建了一个实例
             */
            synchronized (Mgr05.class) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                INSTANCE = new Mgr05();
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100 ; i++) {
            new Thread(()->
                    System.out.println(Mgr05.getInstance().hashCode())
            ).start();
        }
    }
}
