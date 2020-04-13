package Practice2;

import java.util.*;

public class Practice10{

    public static void main(String[] args) {
        //查找数组中指定元素
        int[] arr = {2,6,33,4,55,24,19,30,44,18};
        System.out.println(findElement(arr,33));
        System.out.println(findElement(arr,8));
    }
    public static boolean findElement(int[] arr,int val){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == val){
                return true;
            }
        }
        return false;
    }


    public static void main4(String[] arg) {
        //求数组中元素得到平均值
        int[] arr = {2,6,33,4,55,24,19,30,44,18};
        System.out.println(averge(arr));
    }
    public static double averge(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return (double)sum / arr.length;
    }


    public static void main3(String[] args) {
        //找数组中最大的元素
        int[] array = {2,6,33,4,55,24,19,30,44,18};
        System.out.println(findMaxInArray(array));
    }
    public static int findMaxInArray(int[] arr){
        int max = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }


    public static void main2(String[] args) {
        //数组拷贝
        int[] arr = {1,2,3,4,5,6};
        int[] newArr = Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(newArr));
        int[] newArr2 = Arrays.copyOfRange(arr,0,3);
        System.out.println(Arrays.toString(newArr2));
        System.out.println("===========================");
        System.out.println(Arrays.toString(copyOf(arr)));
        System.out.println(toString(copyOf(arr)));
    }
    public static int[] copyOf(int[] arr){
        int[] ret = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            ret[i] = arr[i];
        }
        return ret;
    }
//    public static void print(int[] arr){
//        for (int x : arr) {
//            System.out.print(x);
//        }
//    }


    public static void main1(String[]args){
        //数组转字符串
        int[] array = {1,2,3,4,5,6};
//        String newArr = Arrays.toString(array);
//        System.out.println(newArr);
        System.out.println(toString(array));
    }
    public static String toString(int[] array){
        String n = "[";
        for (int i = 0; i < array.length; i++) {
            n += array[i];
            if(i != array.length-1){
                n += " ,";
            }
        }
        n = n+"]";
        return n;
    }


}
