/*
 * Copyright (c) 2004, 2023, Michael Tomas Fox's and/or his affiliates. All rights reserved.
 * @MT_F0XTR0T PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package _test;

import org.jetbrains.annotations.NotNull;

class Main {
    private static int partition(int[] arr, int target, int left, int right) {
        int mid = (left + right) / 2;

        if (left > right)
            return -1;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return partition(arr, target, mid + 1, right);
        } else {
            return partition(arr, target, left, mid - 1);
        }
    }

    public static int binarySearch(int @NotNull [] arr, int target) {
        int left = 0;
        int right = arr.length;
        return partition(arr, target, left, right);
    }

    public static void main(String[] args) {
        int[] lst1 = new int[]{-1, 0, 3, 5, 9, 12};
        int[] lst2 = new int[]{-1, 0, 3, 5, 9, 12};

        System.out.println(binarySearch(lst1, 9));
        System.out.println(binarySearch(lst2, 2));
    }
}