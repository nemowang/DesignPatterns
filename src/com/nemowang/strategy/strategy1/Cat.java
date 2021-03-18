package com.nemowang.strategy.strategy1;

/**
 * @Author Nemo Wong
 * @Date 2021/3/18 16:54
 * @Description
 */
public class Cat implements Comparable<Cat> {

    private int weight;
    private int height;

    public Cat(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    @Override
    public int compareTo(Cat cat) {
        if (this.weight < cat.weight) return -1;
        else if (this.weight > cat.weight) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }
}
