package algorithms;

import org.junit.Test;
import utils.ArrayUtil;

/**
 * @Author: Zuo Yichen
 * @Date: 2020/4/29 17:05
 */
public class BubbleSortTest {
    @Test
    public void testSort() {
        int nums[] = ArrayUtil.generateArray();
        new BubbleSort().sort(nums);
        ArrayUtil.print(nums);
    }
}
