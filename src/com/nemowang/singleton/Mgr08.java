package com.nemowang.singleton;

/**
 * @Author Nemo Wong
 * @Date 2021/3/18 15:21
 * @Description 枚举单例
 * 不仅可以解决线程同步，还可以防止反序列化
 */
public enum Mgr08 {

    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100 ; i++) {
            new Thread(()->
                    System.out.println(Mgr08.INSTANCE.hashCode())
            ).start();
        }
    }
}
