package com.nemowang.strategy.strategy2;

import com.nemowang.strategy.strategy1.Comparable;

/**
 * @Author Nemo Wong
 * @Date 2021/3/18 16:55
 * @Description
 */
public class Dog {

    private int food;

    public int getFood() {
        return food;
    }

    public Dog(int food) {


        this.food = food;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
