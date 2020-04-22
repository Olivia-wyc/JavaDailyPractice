package Practice2;

import java.util.Scanner;

public class Practice15 {
    public static void main(String[] args) {
        //旋转数组
        //输入: [1,2,3,4,5,6,7] 和 k = 2
        //输出: [5,6,7,1,2,3,4]
//        int[] arr = {1,2,3,4,5,6,7};
        int[] arr = {-1};
        rotate1(arr,2);
        for (int n : arr) {
            System.out.print(n);
        }
//        rotate2(arr,3);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
    }
    public static void rotate2(int[] nums,int k){
        int[] tmp = new int[nums.length];//产生一个新数组
//       int i = 0;
//        while(k < nums.length && i < nums.length){
//            tmp[k++] = nums[i++];//[0,0,0,1,2,3,4]
//        }
//
//        int j = 0;
//        while(j < k && k < nums.length - 1){
//            tmp[j] = nums[k+1];
//        }
//        for (int l = 0; l < nums.length; l++) {
//            nums[i] = tmp[i];
//        }
//        int i = 0;
//        while(i < nums.length && k < nums.length){
//            tmp[k % nums.length] = nums[i];
//            i++;
//            k++;
//            //这样的话,结果还是[0,0,0,1,2,3,4]
//
//        }
        for (int i = 0; i < nums.length; i++) {
            tmp[(i+k) % nums.length] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = tmp[i];
        }
    }

    public static void rotate1(int[] nums,int k){
        reverse(nums,0,nums.length-1);//[5,4,3,2,1]
        reverse(nums,0,k-1);          //[4,5,3,2,1]
        reverse(nums,k,nums.length-1);      //[4,5,1,2,3]
    }

    public static void main1(String[] args) {
        //翻转一个数组
        int[] arr = {1,2,3,4,5};
        reverse(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int[] nums,int begin,int end){
        int tmp;
        while(begin < end){
            tmp = nums[begin];
            nums[begin] = nums[end];
            nums[end] = tmp;
            begin++;
            end--;
        }
    }


}

