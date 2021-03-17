package com.nemowang.singleton;

/**
 * @Author Nemo Wong
 * @Date 2021/3/17 15:15
 * @Description 单例模式 饿汉式
 * 类加载到内存后，就实例化一个单例，JVM保证线程安全
 * 简单实用，推荐使用
 * 唯一缺点：不管使用与否，类装载时就完成实例化
 */
public class Mgr01 {
    /**
     * 类加载时就初始化一个实例
     */
    private static final Mgr01 INSTANCE = new Mgr01();

    /**
     * 将构造方法私有化private, 使外界不能通过new Mgr01()获取实例
     */
    private Mgr01() {}

    /**
     * 外界获取实例的唯一方法，保证实例的单例化
     * @return
     */
    public static Mgr01 getInstance() {
        return INSTANCE;
    }

    /**
     * 验证实例是否唯一
     * @param args
     */
    public static void main(String[] args) {
        Mgr01 m1 = Mgr01.getInstance();
        Mgr01 m2 = Mgr01.getInstance();
        System.out.println(m1 == m2);
    }
}
