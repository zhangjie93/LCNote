package xyz.zhangjie.array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {

    @Test
    public void testBinarySearchFound() {
        BinarySearch bs = new BinarySearch();
        int[] nums = {1, 3, 5, 6, 9};
        int target = 5;
        int expected = 2; // 5 在数组中的索引是 2
        int result = bs.binarySearch(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void testBinarySearchNotFound() {
        BinarySearch bs = new BinarySearch();
        int[] nums = {1, 3, 5, 6, 9};
        int target = 8;
        int expected = -1; // 8 在数组中不存在
        int result = bs.binarySearch(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void testBinarySearchEmptyArray() {
        BinarySearch bs = new BinarySearch();
        int[] nums = {};
        int target = 1;
        int expected = -1; // 空数组中不存在任何元素
        int result = bs.binarySearch(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void testBinarySearchSingleElement() {
        BinarySearch bs = new BinarySearch();
        int[] nums = {7};
        int target = 7;
        int expected = 0; // 单个元素数组中元素的索引是 0
        int result = bs.binarySearch(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void testBinarySearchTargetFirst() {
        BinarySearch bs = new BinarySearch();
        int[] nums = {1, 3, 5, 6, 9};
        int target = 1;
        int expected = 0; // 1 在数组中的索引是 0
        int result = bs.binarySearch(nums, target);
        assertEquals(expected, result);
    }

    @Test
    public void testBinarySearchTargetLast() {
        BinarySearch bs = new BinarySearch();
        int[] nums = {1, 3, 5, 6, 9};
        int target = 9;
        int expected = 4; // 9 在数组中的索引是 4
        int result = bs.binarySearch(nums, target);
        assertEquals(expected, result);
    }
}