package com.nemowang.strategy.strategy1;

import java.util.Arrays;

/**
 * @Author Nemo Wong
 * @Date 2021/3/18 15:40
 * @Description
 */
public class Sorter {

    public void sort(Comparable[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            int minPos = i;

            for (int j = i+1; j < arr.length; j++) {
                minPos = arr[j].compareTo(arr[minPos]) < 0 ? j : minPos;
            }

            this.swap(arr, i, minPos);
            System.out.println("经过第" + i + "次循环后数组的内容:" + Arrays.toString(arr));
        }
    }

    private void swap(Comparable[] arr, int i, int minPos) {
        Comparable temp = arr[i];
        arr[i] = arr[minPos];
        arr[minPos] = temp;
    }
}
