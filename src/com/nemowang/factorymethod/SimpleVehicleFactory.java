package com.nemowang.factorymethod;

/**
 * @Author Nemo
 * @Description 简单工厂 扩展性差
 * @Date 2021/3/20 11:07
 */
public class SimpleVehicleFactory {

    public Car createCar() {
        // log...
        return new Car();
    }

    public Plane createPlane() {
        return new Plane();
    }
}
