package com.nemowang.factorymethod;

/**
 * @Author Nemo
 * @Description
 * @Date 2021/3/20 10:56
 */
public class Main {

    public static void main(String[] args) {
        Moveable m = new CarFactory().createCar();
        m.go();
    }
}
