package Practice2;

import java.util.Arrays;
import java.util.Scanner;

public class Practice38 {
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int len = scanner.nextInt();
            int[] arr = new int[len];//开辟一个大小为n的数组
            System.out.println(endIndex(arr, len));
        }
    }
    public static int endIndex(int[] arr,int n){
        int index = 0;
        //int i = 0;
        while(index <= arr.length) {
            index = index+2;
            if(index == arr.length){
                index = index % arr.length;
            }
            //  -->1--> -->3-->4--> -->6-->7
            deleteNum(arr, index);
        }
        return index;
    }
    //删除数组中指定元素；
    public  static int[] deleteNum(int[] arr,int index){
        if(index < 0 || index > arr.length){
            System.out.println("非法下标!");
            return arr;
        }
        int[] tmp = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            tmp[i] = arr[i];
        }
        for (int j = index+1; j < arr.length; j++) {
            tmp[j] = arr[j];
        }
        arr = tmp;
        return arr;
    }

    public static int coutIndex(int len, int[] arr) {
        int countDel = 0;//计算删除数的个数
        int count = 0;//计算表示两个数的间隔,当count=3时,表明要删除该位置的元素
        int i = 0;//用来遍历数组
        //(-1)-->(1)-->(-1)-->-1-->(4)  len = 5
        while(true){
            if(countDel == len){//1 2 3
                return i - 1;
            }
            if(i == len){
                i = i % len;
            }
            if(arr[i] != -1){
                count++;
            }
            if(count == 3){
                count = 0;
                countDel++;
                arr[i] = -1;
                //arr[i % len] = -1;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int n = scanner.nextInt();
            int[] arr = new int[n-1];//开辟一个大小为n的数组
            int k = arr[arr.length-1];
            int[] tmp = findMinK(arr, k);
            for (int x:tmp) {
                System.out.println(arr[x]+" ");
            }
         }
    }
    public static int[] findMinK(int[] arr,int k){
        Arrays.sort(arr);
        //再输出后K个元素
        int[] tmp = new int[k];
        for (int i = 0; i < arr.length-1-k; i++) {
            tmp[i] = arr[i];
        }
        arr= tmp;
        return arr;
    }

}

