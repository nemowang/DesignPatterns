package com.nemowang.strategy.strategy2;

/**
 * @Author Nemo Wong
 * @Date 2021/3/18 17:55
 * @Description
 */
public class CatWeightComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat c1, Cat c2) {
        if (c1.getWeight() < c2.getWeight()) return -1;
        else if (c1.getWeight() > c2.getWeight()) return 1;
        else return 0;
    }
}
