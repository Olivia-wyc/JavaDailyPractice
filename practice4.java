package Practice2;

import java.util.Scanner;

public class practice4 {

    public static void main(String[] args) {
        //输出4*5矩阵
        for(int i = 1;i <= 4;i++){
            //控制行数
            for(int j = 1 ; j <= 5 ; j++){
                //控制列数
                System.out.print(i*j+" ");
            }
            System.out.println();
        }
    }


    public static void main3(String[] args) {
        //有1，2，3，4四个数字，能组成多少个不相同且无重复的三位数
        int count = 0;
        for(int a = 1;a <= 4; a++){
            for(int b = 1;b <= 4;b++){
                for(int c = 1;c <= 4;c++){
                    if(a != b && a !=c && b!=c){
                        System.out.println("a:"+a+"b:"+b+"c:"+c);
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }


    public static void main2(String[] args) {
        //输出图形
        // *
        //**
        //***
        //****
        //*****
        //******
        for (int i = 0; i < 7; i++) {//外部循环控制行
            for(int j = 0; j < i; j++){//内部控制符号的数量
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main1(String[] args) {
        //判断是否为素数
        System.out.println("请输入一个整数");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = 2; i < n ; i++){
            if(n % i == 0){
                break;
            }
            if(n < i){
                System.out.println("不是素数");
            }else{
                System.out.println("是素数");
            }
        }
    }
}
