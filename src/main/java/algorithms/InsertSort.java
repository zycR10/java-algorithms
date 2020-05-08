package algorithms;

import base.Sort;

import java.util.Objects;

/**
 * @Author: Zuo Yichen
 * @Date: 2020/4/30 10:26
 */
public class InsertSort extends Sort {
    @Override
    protected void sort(int[] nums) {
        if (Objects.isNull(nums)) {
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j > 0 ; j--) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1);
                }
            }
        }
    }
}
