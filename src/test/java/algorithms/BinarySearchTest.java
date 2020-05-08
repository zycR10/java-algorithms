package algorithms;

import org.junit.Test;
import utils.ArrayUtil;

/**
 * @Author: Zuo Yichen
 * @Date: 2020/5/8 17:44
 */
public class BinarySearchTest {
    @Test
    public void searchTest() {
        int[] nums = ArrayUtil.generateArray();
        new QuickSort().sort(nums);
        int target  = nums[9];
        System.out.println(new BinarySearch().search(nums, target));
    }
}
