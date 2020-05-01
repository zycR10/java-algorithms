package algorithms;

import org.junit.Test;
import utils.ArrayUtil;

/**
 * @Author: Zuo Yichen
 * @Date: 2020/4/30 10:32
 */
public class InsertSortTest {
    @Test
    public void sortTest() {
        int nums[] = ArrayUtil.generateArray();
        new InsertSort().sort(nums);
        ArrayUtil.print(nums);
    }
}
