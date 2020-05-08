package algorithms;


import base.Sort;

import java.util.Objects;

/**
 * @Author: Zuo Yichen
 * @Date: 2020/4/30 10:37
 */
public class SelectSort extends Sort {
    @Override
    protected void sort(int[] nums) {
        if (Objects.isNull(nums)) {
            return;
        }
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            int max = Integer.MIN_VALUE;
            int index = -1;
            for (int j = 0; j < length - i; j++) {
                if (nums[j] > max) {
                    max = nums[j];
                    index = j;
                }
            }
            if (index != length - i - 1) {
                swap(nums, index, length - i - 1);
            }
        }
    }
}
