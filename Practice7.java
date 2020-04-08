package Practice2;

import java.util.Scanner;

public class Practice7 {


    public static void main5(String[] args) {
        //找到 100 - 200 中所有3的倍数
        //[continue的作用是跳过这次循环立即进入下次循环]
        for (int i = 100; i <= 200 ; i++) {
            if(i % 3 == 0){
                System.out.println(i);
                continue;
            }
        }
    }


    public static void main4(String[] args) {
        //找到 100 - 200 中第一个3的倍数
        //[break可以让循环提前结束]
        for (int i = 100; i <= 200 ; i++) {
            if(i % 3 == 0){
                System.out.println(i);
                break;
            }
        }
    }


    public static void main3(String[] args) {
        //计算 1! + 2! + 3! + 4! + 5!
//        int sum = 0;
//        for (int i = 1; i <=5 ; i++) {//2
//            //外层否则求阶乘的和
//            int num = 1;//如果num定义在循坏外部，则每次num都保留的是上次使用后的值
//            for (int j = 1; j <= i ; j++) {
//                //内层负责求阶乘
//                num *= j;
//            }
//            sum += num;
//        }
//        System.out.println(sum);
        int sum = 0;
        int num =  1;
        while(num <= 5){
            int tmp = 1;
            int n = 1;
            while(tmp <= num){
                n *= tmp;
                tmp++;
            }
            sum += n;
            num++;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        //计算一个数的阶乘
        System.out.println("请输入一个整数");
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
            int n = scanner.nextInt();
            int sum = 1;
            for (int i = 1; i <= n; i++) {
                sum *= i;
            }
            System.out.println(sum);
        }
    }

    public static void main1(String[] args) {
        //计算1~100的和（分别用while 和 for）
        int n = 1;
        int num = 0;
        while (n <= 100) {
            num += n;
            n++;
        }
        System.out.println(num);
//        for (int i = 1; i <= 100 ; i++) {
//            num += i;
//        }
//        System.out.println(num);

    }
}
