package com.nemowang.strategy.strategy2;

import java.util.Arrays;

/**
 * @Author Nemo Wong
 * @Date 2021/3/18 15:45
 * @Description
 */
public class Main {

    public static void main(String[] args) {
        //int[] a = {9, 7, 5, 6, 8, 1, 4};
        Cat[] a = {new Cat(1, 1), new Cat(5, 5), new Cat(3, 3)};
        Sorter<Cat> sorter = new Sorter<>();
        sorter.sort(a, new CatWeightComparator());
        System.out.println(Arrays.toString(a));
    }
}
