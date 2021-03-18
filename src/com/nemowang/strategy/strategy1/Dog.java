package com.nemowang.strategy.strategy1;

/**
 * @Author Nemo Wong
 * @Date 2021/3/18 16:55
 * @Description
 */
public class Dog implements Comparable<Dog> {

    private int food;

    public Dog(int food) {
        this.food = food;
    }

    @Override
    public int compareTo(Dog dog) {
        if (this.food < dog.food) return -1;
        else if (this.food > dog.food) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food=" + food +
                '}';
    }
}
