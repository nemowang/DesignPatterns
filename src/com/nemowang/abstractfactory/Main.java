package com.nemowang.abstractfactory;

/**
 * @Author Nemo
 * @Description
 * @Date 2021/3/20 10:56
 */
public class Main {

    public static void main(String[] args) {
        AbstractFactory f = new ModernFacotry();
        Vehicle v = f.createVehicle();
        v.go();
        Weapon w = f.createWeapon();
        w.shoot();
        Food food = f.createFood();
        food.printName();
    }
}
