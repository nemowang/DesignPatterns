package com.nemowang.singleton;

/**
 * @Author Nemo Wong
 * @Date 2021/3/17 15:15
 * @Description 单例模式
 * 静态内部类方式
 * JVM保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 *
 */
public class Mgr07 {

    /**
     * 将构造方法私有化private, 使外界不能通过new Mgr01()获取实例
     */
    private Mgr07() {}

    private static class Mgr07Holder{
        private final static Mgr07 INSTANCE = new Mgr07();
    }

    /**
     * 外界获取实例的唯一方法，保证实例的单例化
     * @return
     */
    public static Mgr07 getInstance() {
        return Mgr07Holder.INSTANCE;
    }

    /**
     * 验证实例是否唯一
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i < 100 ; i++) {
            new Thread(()->
                    System.out.println(Mgr07.getInstance().hashCode())
            ).start();
        }
    }
}
