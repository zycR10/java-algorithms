package algorithms;

import base.Sort;

import java.util.Objects;

/**
 * @Author: Zuo Yichen
 * @Date: 2020/5/2 15:41
 */
public class QuickSort extends Sort {
    @Override
    protected void sort(int[] nums) {
        if (Objects.isNull(nums)) {
            return;
        }
        quickSort(nums, 0, nums.length - 1);
    }

    private void quickSort(int[] nums, int left, int right) {
        if (left >= right) {
            return;
        }
        int emptyIndex = left + (right - left) / 2;
        int leftIndex = left;
        int rightIndex = right;
        int pivot = nums[emptyIndex];
        while (leftIndex < rightIndex) {
            while (leftIndex < rightIndex && nums[rightIndex] >= pivot) {
                rightIndex--;
            }
            swap(nums, rightIndex, emptyIndex);
            emptyIndex = rightIndex;
            while (leftIndex < rightIndex && nums[leftIndex] <= pivot) {
                leftIndex++;
            }
            swap(nums, leftIndex, emptyIndex);
            emptyIndex = leftIndex;
        }
        quickSort(nums, left, leftIndex - 1);
        quickSort(nums, leftIndex + 1, right);
    }
}
