package Practice2;

import java.util.Scanner;

public class Practice8 {
    public static void main1(String[] args) {
        //递归求N的阶乘
        System.out.println("请输入一个非负整数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(factor(n));
    }
    public static int factor(int num){//4 3 2 1
        if(num == 1){
            return num;
        }
        return num * factor(num-1);//4*3*2*1
    }

    public static void main2(String[] args) {
        //递归求 n 个数字之和
        System.out.println("请输入一个整数");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(sum(n));
    }
    public static int sum(int num){
        if(num == 1){
            return num;
        }
        return num + sum(num - 1);
    }


    public static void main3(String[] args) {
        //按顺序打印一个数字的每一位(例如 1234 打印出 1 2 3 4)
        System.out.println("请输入一个整数");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        print(n);
    }
    public static void print(int num){//1234 123 12
        if(num > 9){
            print(num / 10);//123 12 1
        }
        System.out.print(num % 10+" ");//4 3 2 1
    }

}
