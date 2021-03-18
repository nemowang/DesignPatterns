package com.nemowang.strategy.strategy1;

import java.util.Arrays;

/**
 * @Author Nemo Wong
 * @Date 2021/3/18 15:45
 * @Description
 */
public class Main {

    public static void main(String[] args) {
        //int[] a = {9, 7, 5, 6, 8, 1, 4};
        //Cat[] a = {new Cat(1, 1), new Cat(5, 5), new Cat(3, 3)};
        Dog[] a = {new Dog(1), new Dog(5), new Dog(3)};
        Sorter sorter = new Sorter();
        sorter.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
