package Practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice18 {

    public static void main(String[] args) {
        //2、给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组,数组中的元素
        // 一些出现了两次,另一些只出现一次.找到所有在 [1, n] 范围之间没有出现在数组中的数字.
        //输入:[4,3,2,7,8,2,3,1]
        //输出[5,6]
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(arr));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        //先将数组遍历一遍
        //[4,3,2,7,8,2,3,1]
        for (int i = 0; i < nums.length; i++) {
            int newIndex = Math.abs(nums[i])-1;
            if(nums[newIndex] > 0){
//                nums[i] = nums[i] * (-1);
                nums[newIndex] *= -1;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= nums.length; i++) {
            if(nums[i-1] > 0){
                list.add(i);
            }
        }
        return list;
//
//    List<Integer> list = new ArrayList<>();
//        Arrays.sort(nums);//现在是有序的了[1,2,3,4,5,6,7,8]
//        int m = findMax(nums);
//        int i = 0;
//        int j = 1;
//        //[1,2,2,3,3,4,7,8]
//        //[1,2,3,4,5,6,7,8]
//        while(i < nums.length && j <= m){
//            if(nums[i] == j){
//                i++;
//                j++;
//            }else {
//                list.add(j);
//            }
//        }
//        return list;
    }
    public static int findMax(int[] nums){
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(max < nums[i]){
                max = nums[i];
            }
        }
        return max;
    }

    public static void main1(String[] args) {
        //1、给定两个数组，编写一个函数来计算它们的交集。
        //输入: nums1 = [1,2,2,1], nums2 = [2,2]
        //输出: [2,2]
        //输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        //输出: [4,9]
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        int[] ret1 = intersect(arr1,arr2);
        System.out.println(Arrays.toString(ret1));
        int[] arr3 = {4,9,5};
        int[] arr4 = {9,4,9,8,4};
        int[] ret2 = intersect(arr3,arr4);
        System.out.println(Arrays.toString(ret2));

    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] == nums2[j]){
                //把i放进要返回出去的那个数组中去
                list.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{
                i++;
            }
        }
        int[] tmp = new int[list.size()];
        int index = 0;
        for (int n : list) {
            tmp[index++] = n;
        }
        return tmp;
    }
}
