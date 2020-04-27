package Practice2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


//给定一个整数数组  nums，求出数组从索引 i 到 j  (i ≤ j) 范围内元素的总和，包含 i,  j 两点。
//给定 nums = [-2, 0, 3, -5, 2, -1]，求和函数为 sumRange()
//sumRange(0, 2) -> 1
//sumRange(2, 5) -> -1
//sumRange(0, 5) -> -3
class NumArray {

    public static int[] tmp;

    public NumArray(int[] nums) {
        tmp = nums;
    }

    public static int sumRange(int i, int j) {
        int sum = 0;
        for (int k = i; k <= j; k++) {
            sum += tmp[k];
        }
        return sum;
    }

    public static void main1(String[] args) {
        int[]  nums = {-2, 0, 3, -5, 2, -1};
        NumArray numArray = new NumArray(nums);
        System.out.println(sumRange(0, 4));
    }
}


public class Practice17 {

    public static void main(String[] args) {
        //给定两个数组，编写一个函数来计算它们的交集。
        //输入: nums1 = [1,2,2,1], nums2 = [2,2]
        //输出: [2]
        //输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        //输出: [9,4]
        int[] arr1 = {4,9,5};
        int[] arr2 = {9,4,9,8,4};
        int[] ret = intersection(arr1, arr2);
        System.out.println(Arrays.toString(ret));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        int i = 0;
        int j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while((i < nums1.length) && (j < nums2.length)){
            if(nums1[i] == nums2[j]){
                set.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                j++;
            }
        }
        int[] tmp = new int[set.size()];
        int index = 0;
        for ( int num : set) {
            tmp[index++] = num;
        }
        return tmp;
    }

    public static void main1(String[] args) {
        //给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
        //函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
        //返回的下标值（index1 和 index2）不是从零开始的。
        //你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
        int[] arr = {2,7,11,15};
        int[] ret = twoSum(arr,9);
        System.out.println(ret);
    }

    public static int[] twoSum(int[] numbers, int target) {
//        int i = 0;
//        int j = 1;
//        int[] tmp = new int[2];
//        while((j < numbers.length - 1) && (i < j)){
//            if(numbers[i] + numbers[j] == target){
//                tmp[0] = i+1;
//                tmp[1] = j+1;
//            }else{
//                i++;
//                j++;
//            }
//        }
//        return tmp;
        //所给的数组是有序的，就可以考虑令i从头开始，j从尾部开始，i+j再与所给值进行比较，由于它是有序的
        int i = 0;
        int j = numbers.length - 1;
        int[] tmp = new int[2];
        while((i < j) && (i < numbers.length - 1)){
            if(numbers[i] + numbers[j] > target){
                j--;
            }else if(numbers[i] + numbers[j] < target){
                i++;
            }else{
                tmp[0] = i+1;
                tmp[1] = j+1;
                return tmp;
            }
        }
        return null;
    }
}


