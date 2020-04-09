package Practice2;

import java.util.Scanner;

public class Practice8_1 {
    public static void main3(String[] args) {
        //求斐波那契数列的第 N 项(递归)
        //1  1  2  3  5  8  13  21  34  55  89
        System.out.println("请输入一个非负整数");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Fib(n));
    }
    public static int Fib(int num){
        if(num == 1 || num == 2){
            return 1;
        }
        return Fib(num - 2) + Fib(num - 1);
    }


    public static void main2(String[] args) {
        //求斐波那契数列的第 N 项(非递归)
        //1  1  2  3  5  8  13  21  34  55  89
        System.out.println("请输入一个非负整数");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(fib(n));

    }
    public static int fib(int num){//4
        int num1 = 1;
        int num2 = 1;
        int tmp = 0;
        for (int i = 3; i <= num ; i++) {
            tmp = num1 + num2;//2
            num1 = num2;
            num2 = tmp;
        }
        return tmp;
    }


    public static void main1(String[] args) {
        //写一个递归方法，输入一个非负整数，返回组成它的数字之和.
        // 例如，输入 1729, 则应该返回1+7+2+9，它的和是19
        System.out.println("请输入一个非负整数");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sum1(n));
    }
    public static int sum1(int num){//1729
        if(num < 10){
            return num;
        }
        //返回的肯定是某几个数字之和；
        return num % 10 + sum1(num / 10);//9+2+7+1
    }
}
