package algorithms;

import base.Algorithm;

import java.util.Objects;

/**
 * @Author: Zuo Yichen
 * @Date: 2020/4/29 16:51
 */
public class BubbleSort extends Algorithm {

    protected void sort(int[] nums) {
        if (Objects.isNull(nums)) {
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            int temp;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                }
            }
        }
    }
}
