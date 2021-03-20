package com.nemowang.abstractfactory;

/**
 * @Author Nemo
 * @Description
 * @Date 2021/3/20 11:43
 */
public class MagicFactory extends AbstractFactory {
    @Override
    Food createFood() {
        return new Mushroom();
    }

    @Override
    Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    Weapon createWeapon() {
        return new MagicStick();
    }
}
