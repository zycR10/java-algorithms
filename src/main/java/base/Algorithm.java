package base;

import com.sun.istack.internal.NotNull;

/**
 * @Author: Zuo Yichen
 * @Date: 2020/4/29 16:52
 */
public abstract class Algorithm {
    protected abstract void sort(@NotNull int[] nums);

    protected void swap(int[] nums, int var1, int var2) {
        if (var1 == var2) {
            return;
        }
        int temp = nums[var1];
        nums[var1] = nums[var2];
        nums[var2] = temp;
    }
}
