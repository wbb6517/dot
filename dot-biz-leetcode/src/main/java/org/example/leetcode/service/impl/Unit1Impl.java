package org.example.leetcode.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.example.leetcode.service.Unit1Service;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Unit1Impl implements Unit1Service {

    /**
     * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。
     * <p>
     * 请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。
     * <p>
     * 注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。
     * <p>
     * 示例 1：
     * <p>
     * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
     * 输出：[1,2,2,3,5,6]
     * 解释：需要合并 [1,2,3] 和 [2,5,6] 。
     * 合并结果是 [1,2,2,3,5,6] ，其中斜体加粗标注的为 nums1 中的元素。
     * 示例 2：
     * <p>
     * 输入：nums1 = [1], m = 1, nums2 = [], n = 0
     * 输出：[1]
     * 解释：需要合并 [1] 和 [] 。
     * 合并结果是 [1] 。
     * 示例 3：
     * <p>
     * 输入：nums1 = [0], m = 0, nums2 = [1], n = 1
     * 输出：[1]
     * 解释：需要合并的数组是 [] 和 [1] 。
     * 合并结果是 [1] 。
     * 注意，因为 m = 0 ，所以 nums1 中没有元素。nums1 中仅存的 0 仅仅是为了确保合并结果可以顺利存放到 nums1 中。
     */
    @Override
    public void getDemo1() {
        int[] nums1 = new int[]{2, 0};
        int[] nums2 = new int[]{1};

//        nums1 = new int[]{0};
//        nums2 = new int[]{1};
        // 如果nums1第一个值为0，直接将nums2赋值给nums1

        // nums1的尾指针
        int pNums1 = nums1.length - 1;
        log.info("pNums1: {}", pNums1);

        // nums2的尾指针
        int nNums2 = nums2.length - 1;
        log.info("nNums2: {}", nNums2);

        // nums1中第一个非0元素的索引
        int mNums1 = nums1.length - nums2.length- 1;
        log.info("mNums1: {}", mNums1);


        while (nNums2 >= 0 || mNums1 >= 0) {
            // 第一个数组结束
            if (mNums1==-1){
                nums1[pNums1--] = nums2[nNums2--];
            }
            // 第二个数组结束
            if (nNums2==-1){
                nums1[pNums1--] = nums1[mNums1--];
            }
            // 比较两个数组元素，取较大的值
            if (nums1[mNums1] > nums2[nNums2]) {
                nums1[pNums1--] = nums1[mNums1--];
            } else {
                nums1[pNums1--] = nums2[nNums2--];
            }
        }
        log.info("nums1: {}", nums1);
        log.info("nums2: {}", nums2);

    }
}
