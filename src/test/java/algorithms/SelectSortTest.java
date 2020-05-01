package algorithms;

import org.junit.Test;
import utils.ArrayUtil;

/**
 * @Author: Zuo Yichen
 * @Date: 2020/4/30 10:45
 */
public class SelectSortTest {
    @Test
    public void sortTest() {
        int nums[] = ArrayUtil.generateArray();
        new SelectSort().sort(nums);
        ArrayUtil.print(nums);
    }
}
