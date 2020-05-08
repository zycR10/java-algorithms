package algorithms;

import base.Algorithm;
import base.Sort;

import java.util.Objects;

/**
 * @Author: Zuo Yichen
 * @Date: 2020/4/29 16:51
 */
public class BubbleSort extends Sort {

    protected void sort(int[] nums) {
        if (Objects.isNull(nums)) {
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    swap(nums, i, j);
                }
            }
        }
    }
}
