package com.nemowang.singleton;

/**
 * @Author Nemo Wong
 * @Date 2021/3/17 15:32
 * @Description 单例模式 懒汉式
 * 初始化的另一种写法
 */
public class Mgr02 {
    private static final Mgr02 INSTANCE;
    static {
        INSTANCE = new Mgr02();
    }

    private Mgr02() {}

    public static Mgr02 getInstance() {
        return INSTANCE;
    }
}
