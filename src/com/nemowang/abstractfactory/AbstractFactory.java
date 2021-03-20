package com.nemowang.abstractfactory;

/**
 * @Author Nemo
 * @Description
 * @Date 2021/3/20 11:30
 */
public abstract class AbstractFactory {
    abstract Food createFood();
    abstract Vehicle createVehicle();
    abstract Weapon createWeapon();
}
