package algorithms;

import org.junit.Test;
import utils.ArrayUtil;

/**
 * @Author: Zuo Yichen
 * @Date: 2020/5/2 16:27
 */
public class QuickSortTest {
    @Test
    public void sortTest() {
        int nums[] = ArrayUtil.generateArray();
        new QuickSort().sort(nums);
        ArrayUtil.print(nums);
    }
}
