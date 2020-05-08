package algorithms;

import base.Search;

import java.util.Objects;

/**
 * @Author: Zuo Yichen
 * @Date: 2020/5/8 17:13
 */
public class BinarySearch extends Search {

    @Override
    protected int search(int[] nums, int target) {
        if (Objects.isNull(nums)) {
            return -1;
        }
        int low = 0;
        int high = nums.length - 1;
        int middle;
        while (low <= high) {
            middle = low + (high - low) / 2;
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[middle] < target) {
                low = middle + 1;
            } else {
                high = middle - 1;
            }
        }
        return -1;
    }
}
