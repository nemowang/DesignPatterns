package com.nemowang.factorymethod;

/**
 * @Author Nemo
 * @Description
 * @Date 2021/3/20 11:09
 */
public class CarFactory {

    public Moveable createCar() {
        return new Car();
    }
}
