package utils;

import java.util.Objects;
import java.util.Random;

/**
 * @Author: Zuo Yichen
 * @Date: 2020/4/29 17:14
 */
public class ArrayUtil {
    public static int[] generateArray() {
        return generateArray(10);
    }

    public static int[] generateArray(int num) {
        Random random = new Random();
        int[] nums = new int[num];
        for (int i = 0; i < num; i++) {
            nums[i] = random.nextInt(100);
        }
        return nums;
    }

    public static void print(int[] nums) {
        if (Objects.isNull(nums)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int num : nums) {
            sb.append(num).append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}
