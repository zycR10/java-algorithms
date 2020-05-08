package algorithms;

import base.Bucket;
import base.Sort;
import utils.ArrayUtil;

import java.util.Objects;

/**
 * @Author: Zuo Yichen
 * @Date: 2020/5/3 16:00
 */
public class BucketSort extends Sort {
    @Override
    protected void sort(int[] nums) {
        if (Objects.isNull(nums)) {
            return;
        }
        bucketSort(nums, 10, 10);
    }

    private void bucketSort(int[] nums, int bucketLimit, int bucketNum) {
        Bucket[] buckets = new Bucket[bucketNum];
        for (int i = 0; i < bucketNum; i++) {
            buckets[i] = new Bucket(i * bucketLimit, i * bucketLimit + bucketLimit - 1);
        }
        int index;
        for (int num : nums) {
            index = num / 10;
            buckets[index].add(num);
        }
        int[] bucketNums;
        for (Bucket bucket : buckets) {
            bucketNums = bucket.getNums();
            new QuickSort().sort(bucketNums);
            // print to console
            ArrayUtil.print(bucketNums);
        }
    }
}
