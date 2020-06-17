package Practice2;

import java.util.Scanner;

public class Practice43 {
    //1、组个最小数(输入的是从0开始的数字数量)
    //可以将输入的数字放在一个数组中,然后遍历这个数组找出非0的最小元素,将该元素当作最终结果的第一位,若数组中有0元素
    //将所有的0元素都放到紧跟首元素的后面,再将数组中剩下的元素按从小到大依次放到前面元素的后面
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
//        while(sc.hasNext()){
//            int n = sc.nextInt();
//            for (int i = 0; i < arr.length; i++) {
//                arr[i] = n;//[2,2,0,0,0,3,0,0,1,0]
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        if(arr[0] == 0){
            for (int i = 0; i < arr.length; i++) {
                while(arr[i] > 0){
                    System.out.print(i);
                    arr[i]--;
                }
            }
        }else{
            //找出第一个不为0的数字
            for (int i = 1; i < arr.length; i++) {
                if(arr[i] != 0){
                    System.out.print(i);
                    arr[i]--;
                    break;
                }
            }
            //然后依次输出所有的0
            while(arr[0] > 0){
                System.out.print(0);
                arr[0]--;
            }
            for (int i = 1; i < arr.length; i++) {
                while(arr[i] > 0) {
                    System.out.print(i);
                    arr[i]--;
                }
            }
        }
//        int sum = 0;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//            int[] tmp = new int[sum];
//
//        }
    }
    //2、验证任何一个整数m的立方都可以写成m个连续奇数相加之和
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(method1(n));
    }
    public static String method1(int n){
        int start = n*(n-1)+1;
        int end = n+(n*n-1);
        StringBuffer sb = new StringBuffer();
        for (int i = start; i <= end; i++) {
            if(i != end){
                sb.append(i+"+");
                i++;//为什么不是i+2,原因是for循环里已经加了一次i了
            }else{
                sb.append(i);
                i++;
            }
        }
        return sb.toString();
    }
    public static String method(int n){
        int[] arr = new int[n];
        int tmp = n*(n-1)+1;
        StringBuffer sb =  new StringBuffer();
        arr[0] = tmp;
        sb.append(tmp+"+");
        for(int i = 1; i < arr.length-1; i++){
            tmp = tmp+2;
            arr[i] = tmp;
            sb.append(arr[i]+"+");
        }
        sb.append(tmp+2+"");
        return sb.toString();
    }
//    public static void put(int[] arr,int n){
//        int j = 0;
//        while(j < 10) {
//            for (int i = ; i < n; i++) {
//                arr[i] = j;
//            }
//            j++;
//        }
//    }
}
