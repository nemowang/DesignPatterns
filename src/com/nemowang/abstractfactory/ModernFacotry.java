package com.nemowang.abstractfactory;

/**
 * @Author Nemo
 * @Description
 * @Date 2021/3/20 11:42
 */
public class ModernFacotry extends AbstractFactory {
    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Vehicle createVehicle() {
        return new Car();
    }

    @Override
    Weapon createWeapon() {
        return new AK47();
    }
}
