package Practice2;

import java.util.Arrays;

public class Practice11 {

    public static void main4(String[] args) {
        //数组逆序
        int[] arr = {23,34,12,6,29,10};
        System.out.println("逆序前："+Arrays.toString(arr));
        reverse(arr);
        System.out.println("逆序后："+Arrays.toString(arr));
    }
    public static void reverse(int[] arr){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right) {
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }
    public static void print(int[] arr){
        for (int x : arr) {
            System.out.print(x);
        }
    }


    public static void main2(String[] args) {
        //判断数组的有序性
        int[] arr1 = {1,6,9,11,23,37,39};
        int[] arr2 = {2,4,6,1,7,10,4};
        System.out.println(ascend(arr1));
        System.out.println(ascend(arr2));
        System.out.println("=====================");
        int[] arr3 = {23,34,12,6,29,10};
        int[] arr4 = {54,33,27,19,15,9};
        System.out.println(descend(arr3));
        System.out.println(descend(arr4));
    }
    public static boolean ascend(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i+1]){
                return false;
            }
        }
        return true;
    }
    public static boolean descend(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] < arr[i + 1]){
                return false;
            }
        }
        return true;
    }

    public static void main1(String[] args) {
        //查找数组中指定元素【二分查找】
        int[] arr = {1,2,3,4,5,6};
        System.out.println(binarySearch(arr,1));
        System.out.println(binarySearch(arr,8));
    }
    public static boolean binarySearch(int[] arr,int val){
        //1 2 3 4 7 9 10
        int left = 0;
        int right = arr.length - 1;
        while(left <= right) {
            int mid = (left + right)/2;
            if(val > arr[mid]){
                left = mid + 1;
            }else if(val < arr[mid]){
                right = mid - 1;
            }else{
                return true;
            }
        }
        return false;
    }
}
