package algorithms;

import org.junit.Test;
import utils.ArrayUtil;

/**
 * @Author: Zuo Yichen
 * @Date: 2020/4/30 15:10
 */
public class MergeSortTest {
    @Test
    public void sortTest() {
        int[] nums = ArrayUtil.generateArray(10);
        new MergeSort().sort(nums);
        ArrayUtil.print(nums);
    }
}
