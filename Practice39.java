package Practice2;

import java.util.Scanner;

public class Practice39 {
    //1、末尾0的个数 (给一个 n ,求 n! 末尾 0 的个数)
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n < 1 || n > 1000){
            System.out.println("输入非法！");
        }
        int count = 0;
        while(n != 0){
            count = count + n/5;
            n = n / 5;
        }
        System.out.println(count);
    }

//    public static long jiecheng(int n){
//        if(n <= 1 || n >= 1000){
//            return -1;
//        }
//        if(n == 0 || n == 1){
//            return 1;
//        }
//        return n * jiecheng(n-1);
//    }
//    public static long jiecheng1(int n){
//        if(n < 1 || n > 1000){
//            return -1;
//        }
//        int sum = 1;
//        for (int i = 1; i <= n ; i++) {
//            sum *= i;
//        }
//        return sum;
//    }
//    public static int findZero(long n){
//        method(n);//得知n有几位数，并且打印它们
//        if(n > 9){
//            findZero(n / 10);
//            n = n % 10;
//        }
//    }
//    public static int method(long num){//1234 123 12
//        int count = 1;
//        if(num > 9){
//            method(num / 10);//123 12 1
//            count++;
//        }
//        System.out.print(num % 10+" ");//4 3 2 1
//        return count;
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(reverse(n));
    }
    public static void print(int n){
        StringBuffer sb = new StringBuffer();
        if(n > 9){
            print(n/ 10);
        }
        sb.append(n % 10);//1234
        sb = sb.reverse();//4321
        System.out.print(sb);
    }
    public  static StringBuffer reverse(int n){
        String str = n + "";//现在数字n变成字符串了
        //然后需要遍历字符串，倒着打印
        char[] ch = str.toCharArray();//[1,2,3,4]
        StringBuffer sb = new StringBuffer();
        for (int i = ch.length-1; i >= 0 ; i--) {
            sb.append(ch[i]);
        }
        return sb;
    }
}
