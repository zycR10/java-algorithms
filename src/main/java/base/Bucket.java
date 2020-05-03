package base;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: Zuo Yichen
 * @Date: 2020/5/3 16:13
 */
public class Bucket {
    int min;
    int max;
    List<Integer> nums;
    AtomicInteger index = new AtomicInteger(0);

    public Bucket(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public synchronized void add(int num) {
        if (nums == null) {
            nums = new ArrayList<>();
        }
        nums.add(num);
    }

    public int[] getNums() {
        if (nums == null || nums.size() == 0) {
            return null;
        }
        int[] array = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            array[i] = nums.get(i);
        }
        return array;
    }
}
