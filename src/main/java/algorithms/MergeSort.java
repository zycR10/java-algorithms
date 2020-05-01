package algorithms;

import base.Algorithm;

import java.util.Arrays;
import java.util.Objects;

/**
 * @Author: Zuo Yichen
 * @Date: 2020/4/30 14:29
 */
public class MergeSort extends Algorithm {
    @Override
    protected void sort(int[] nums) {
        if (Objects.isNull(nums)) {
            return;
        }
        divideAndMerge(nums, 0, nums.length - 1);
    }

    private void divideAndMerge(int[] nums, int start, int end) {
        if (start < end) {
            int middle = start + (end - start) / 2;
            divideAndMerge(nums, start, middle);
            divideAndMerge(nums, middle + 1, end);
            merge(nums, start, middle, end);
        }
    }

    private void merge(int[] nums, int start, int middle, int end) {
        int[] leftNums = Arrays.copyOfRange(nums, start, middle + 1);
        int[] rightNums = Arrays.copyOfRange(nums, middle + 1, end + 1);
        int leftIndex = 0;
        int rightIndex = 0;
        int currIndex = start;
        while (leftIndex < leftNums.length && rightIndex < rightNums.length) {
            // >= make sure the algorithm is stable
            if (leftNums[leftIndex] <= rightNums[rightIndex]) {
                nums[currIndex++] = leftNums[leftIndex++];
            } else {
                nums[currIndex++] = rightNums[rightIndex++];
            }
        }
        while (leftIndex < leftNums.length) {
            nums[currIndex++] = leftNums[leftIndex++];
        }
        while (rightIndex < rightNums.length) {
            nums[currIndex++] = rightNums[rightIndex++];
        }
    }
}
