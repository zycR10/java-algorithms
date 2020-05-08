package base;

import com.sun.istack.internal.NotNull;

/**
 * @Author: Zuo Yichen
 * @Date: 2020/5/8 17:16
 */
public abstract class Search extends Algorithm{
    protected abstract int search(@NotNull int[] nums, int target);
}
