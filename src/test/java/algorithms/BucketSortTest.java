package algorithms;

import org.junit.Test;
import utils.ArrayUtil;

/**
 * @Author: Zuo Yichen
 * @Date: 2020/5/3 16:23
 */
public class BucketSortTest {
    @Test
    public void sortTest() {
        int[] nums = ArrayUtil.generateArray();
        new BucketSort().sort(nums);
    }
}
