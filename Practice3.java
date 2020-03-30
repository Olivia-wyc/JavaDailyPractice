package Practice2;

import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) {
        // 求两个正整数a,b的最大公约数
        //最大公约数肯定<=min(a,b)
        System.out.println("请输入两个整数");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
       // int min = Math.min(a,b);
        if(a < b){
            for (int i = a; i >= 1; i--) {
                if(a % i == 0 && b % i == 0){
                    System.out.println("最大公约数为："+i);
                    break;
                }
            }
        }else if(a == b){
            System.out.println(a+"是a和b的最大公约数");
        }else{
            for (int i = b; i >= 1; i--) {
                if(a % i == 0 && b % i == 0){
                    System.out.println("最大公约数为："+i);
                }
            }

        }

    }


    public static void main2(String[] args) {
        //编写程序数一下 1到 100 的所有整数中出现多少个数字9。19个
        //9,19,29,39,49,59,69,79,89,99,91,92,93,94,95,96,97,98
        int count = 0;
        for(int i = 1 ; i <= 100 ; i++){
            if(i % 10 == 9 || i / 10 == 9){
                count ++;
            }
        }
        System.out.println(count);//
    }


    public static void main1(String[] args) {
        //计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值。
        int flg = 1;
        double temp ;
        double sum = 0;
        for (double i = 1; i <= 100 ; i++) {
            temp = 1/i * flg;
            flg = - flg;
            sum += temp;
        }
        System.out.println(sum);
    }
}
