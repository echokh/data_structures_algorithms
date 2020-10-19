package com.khstudy.base;

import java.util.Arrays;

/**
 * 选择排序，
 * 从0到（N-1）找到最小的数放到0的位置
 * 从1到（N-1）找到最小的数放到1的位置
 * 从2到（N-1）找到最小的数放到2的位置
 * 。。。。
 */
public class D01_SelectionSort {


    public static void SelectionSort(int[] arr) {

        if (arr == null || arr.length <= 2) {
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) {

            int swapIndex = i;

            for (int j = i + 1; j < arr.length; j++) {

                swapIndex = arr[swapIndex] > arr[j] ? j : swapIndex;
            }

            swap(arr, i, swapIndex);

        }
    }

    /**
     * 交换
     *
     * @param arr
     * @param i
     * @param swapIndex
     */
    private static void swap(int[] arr, int i, int swapIndex) {
        int temp = arr[i];
        arr[i] = arr[swapIndex];
        arr[swapIndex] = temp;
    }


    public static void main(String[] args) {

        int[] arr=new int[]{1,28,46,13,4654,321,54,31,51,55};
        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
