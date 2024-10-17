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
        int mNums1 = nums1.length - nums2.length - 1;
        log.info("mNums1: {}", mNums1);


        while (nNums2 >= 0 || mNums1 >= 0) {
            // 第一个数组结束
            if (mNums1 == -1) {
                nums1[pNums1--] = nums2[nNums2--];
            }
            // 第二个数组结束
            if (nNums2 == -1) {
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

    /**
     * 给你一个数组 nums 和一个值 val，你需要 原地 移除所有数值等于 val 的元素。元素的顺序可能发生改变。然后返回 nums 中与 val 不同的元素的数量。
     * <p>
     * 假设 nums 中不等于 val 的元素数量为 k，要通过此题，您需要执行以下操作：
     * <p>
     * 更改 nums 数组，使 nums 的前 k 个元素包含不等于 val 的元素。nums 的其余元素和 nums 的大小并不重要。
     * 返回 k。
     * 用户评测：
     * <p>
     * 评测机将使用以下代码测试您的解决方案：
     * <p>
     * int[] nums = [...]; // 输入数组
     * int val = ...; // 要移除的值
     * int[] expectedNums = [...]; // 长度正确的预期答案。
     * // 它以不等于 val 的值排序。
     * <p>
     * int k = removeElement(nums, val); // 调用你的实现
     * <p>
     * assert k == expectedNums.length;
     * sort(nums, 0, k); // 排序 nums 的前 k 个元素
     * for (int i = 0; i < actualLength; i++) {
     * assert nums[i] == expectedNums[i];
     * }
     * 如果所有的断言都通过，你的解决方案将会 通过。
     * <p>
     * <p>
     * <p>
     * 示例 1：
     * <p>
     * 输入：nums = [3,2,2,3], val = 3
     * 输出：2, nums = [2,2,_,_]
     * 解释：你的函数函数应该返回 k = 2, 并且 nums 中的前两个元素均为 2。
     * 你在返回的 k 个元素之外留下了什么并不重要（因此它们并不计入评测）。
     * 示例 2：
     * <p>
     * 输入：nums = [0,1,2,2,3,0,4,2], val = 2
     * 输出：5, nums = [0,1,4,0,3,_,_,_]
     * 解释：你的函数应该返回 k = 5，并且 nums 中的前五个元素为 0,0,1,3,4。
     * 注意这五个元素可以任意顺序返回。
     * 你在返回的 k 个元素之外留下了什么并不重要（因此它们并不计入评测）。
     */
    @Override
    public void getDemo2() {

        int[] nums = new int[]{1};
        int val = 1;

        // 数组为空
        if (nums.length == 0) {
            log.info("k {}", 0);
            return;
        }
        // 尾指针
        int pNums = nums.length - 1;
        // 头指针
        int hNums = 0;
        while (hNums < pNums) {
            // 不等于val，头指针后移
            if (nums[hNums] != val) {
                hNums++;
            }
            // 等于val，交换，前移尾指针
            if (nums[hNums] == val) {
                int temp = nums[pNums];
                nums[pNums] = nums[hNums];
                nums[hNums] = temp;
                pNums--;
            }
            log.info("nums: {}", nums);
        }

        if (nums[hNums] == val) {
            log.info("k: {}", hNums);
        } else {
            log.info("k: {}", hNums + 1);
        }
        log.info("nums: {}", nums);


    }

    /**
     * 给你一个 非严格递增排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。然后返回 nums 中唯一元素的个数。
     * <p>
     * 考虑 nums 的唯一元素的数量为 k ，你需要做以下事情确保你的题解可以被通过：
     * <p>
     * 更改数组 nums ，使 nums 的前 k 个元素包含唯一元素，并按照它们最初在 nums 中出现的顺序排列。nums 的其余元素与 nums 的大小不重要。
     * 返回 k 。
     * 判题标准:
     * <p>
     * 系统会用下面的代码来测试你的题解:
     * <p>
     * int[] nums = [...]; // 输入数组
     * int[] expectedNums = [...]; // 长度正确的期望答案
     * <p>
     * int k = removeDuplicates(nums); // 调用
     * <p>
     * assert k == expectedNums.length;
     * for (int i = 0; i < k; i++) {
     * assert nums[i] == expectedNums[i];
     * }
     * 如果所有断言都通过，那么您的题解将被 通过。
     * <p>
     * <p>
     * <p>
     * 示例 1：
     * <p>
     * 输入：nums = [1,1,2]
     * 输出：2, nums = [1,2,_]
     * 解释：函数应该返回新的长度 2 ，并且原数组 nums 的前两个元素被修改为 1, 2 。不需要考虑数组中超出新长度后面的元素。
     * 示例 2：
     * <p>
     * 输入：nums = [0,0,1,1,1,2,2,3,3,4]
     * 输出：5, nums = [0,1,2,3,4]
     * 解释：函数应该返回新的长度 5 ， 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4 。不需要考虑数组中超出新长度后面的元素。
     */
    @Override
    public void getDemo3() {
        int[] nums = new int[]{1, 1, 2};
        // 快指针
        int fast = 0;
        // 慢指针
        int slow = 0;
        while (fast < nums.length) {
            if (nums[fast] != nums[slow]) {
                slow++;
                nums[slow] = nums[fast];
            } else {
                fast++;
            }
        }
        log.info("slow： {}", ++slow);
    }

    /**
     * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使得出现次数超过两次的元素只出现两次 ，返回删除后数组的新长度。
     * <p>
     * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     * <p>
     * <p>
     * <p>
     * 说明：
     * <p>
     * 为什么返回数值是整数，但输出的答案是数组呢？
     * <p>
     * 请注意，输入数组是以「引用」方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
     * <p>
     * 你可以想象内部操作如下:
     * <p>
     * // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
     * int len = removeDuplicates(nums);
     * <p>
     * // 在函数里修改输入数组对于调用者是可见的。
     * // 根据你的函数返回的长度, 它会打印出数组中 该长度范围内 的所有元素。
     * for (int i = 0; i < len; i++) {
     * print(nums[i]);
     * }
     * <p>
     * <p>
     * 示例 1：
     * <p>
     * 输入：nums = [1,1,1,2,2,3]
     * 输出：5, nums = [1,1,2,2,3]
     * 解释：函数应返回新长度 length = 5, 并且原数组的前五个元素被修改为 1, 1, 2, 2, 3。 不需要考虑数组中超出新长度后面的元素。
     * 示例 2：
     * <p>
     * 输入：nums = [0,0,1,1,1,1,2,3,3]
     * 输出：7, nums = [0,0,1,1,2,3,3]
     * 解释：函数应返回新长度 length = 7, 并且原数组的前七个元素被修改为 0, 0, 1, 1, 2, 3, 3。不需要考虑数组中超出新长度后面的元素。
     */
    @Override
    public void getDemo4() {
        int[] nums = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3};
        // 快指针
        int fast = 1;
        // 慢指针
        int slow = 1;
        // 计数器
        int count = 1;
        while (fast < nums.length) {
            if (nums[fast] == nums[fast-1]){
                if (count < 2){
                    nums[slow++] = nums[fast];
                    count++;
                }

            }else {
                count=1;
                nums[slow++] = nums[fast];
            }
            fast++;

            log.info("fast： {}", fast);
            log.info("slow： {}", slow);
            log.info("count： {}", count);
            log.info("nums： {}", nums);
        }
        log.info("slow： {}", ++slow);
        /* 另一个解题思路，没想起来，只想到了快慢指针和校验相邻位计数
        因为本题要求相同元素最多出现两次而非一次，所以我们需要检查上上个应该被保留的元素 nums[slow−2] 是否和当前待检查元素 nums[fast] 相同。
        当且仅当 nums[slow−2]=nums[fast] 时，当前待检查元素 nums[fast] 不应该被保留（因为此时必然有 nums[slow−2]=nums[slow−1]=nums[fast]）。
        最后，slow 即为处理好的数组的长度。
         */

    }
}
