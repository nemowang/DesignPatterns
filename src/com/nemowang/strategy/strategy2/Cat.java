package com.nemowang.strategy.strategy2;

/**
 * @Author Nemo Wong
 * @Date 2021/3/18 17:47
 * @Description
 */
public class Cat {
    private int weight;
    private int height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
