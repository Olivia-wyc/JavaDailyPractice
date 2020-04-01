package Practice2;

import java.util.Scanner;

public class practice5 {


        public static void main(String[] args) {
            //输出一个整数的每一位1234
            //如何得到各位？ i % 10
            //如何得到十位？ (i / 10)%10
            //如何得到百位？ (i/10/10)%10
            //如何得到千位？ (i/10/10/10)%10
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入一个整数：");
            long a = scanner.nextLong();
            //12345
            while(a != 0){
                long n = a % 10;//5 4 3 2 1
                a = a/10;//1234 123 12 1 0
                System.out.print(n+" ");//5 4 3 2 1
            }

        }


        public static void main2(String[] args) {
            // 编写代码模拟三次密码输入的场景。
            // 最多能输入三次密码，密码正确，提示“登录成功”,密码错误,可以重新输入，最多输入三次。三次均错，则提示退出程序
            Scanner scanner = new Scanner(System.in);
            String password = "123456";
            int i = 0;
            System.out.println("您有3次输入机会！请输入密码");
            while(scanner.hasNextInt()) {
                String pwd = scanner.nextLine();
                i++;
                if(pwd.equals(password)){
                    System.out.println("登陆成功");
                    break;
                }else{
                    System.out.println("密码错误：");
                }
                if(i == 3){
                    System.out.println("退出系统");
                }

            }

        }


        public static void main1(String[] args) {
            //求出0～999之间的所有“水仙花数”并输出。
            // (“水仙花数”是指一个三位数，其各位数字的立方和确好等于该数本身，
            //如；153＝1＋5＋3?，则153是一个“水仙花数”。
            int count = 0;
            for (int i = 0; i < 1000; i++) {
                int geiwei = i % 10;        //153如何得到各位3？ 153 % 10 == 3
                int shiwei = (i / 10) % 10; //153如何得到十位5？ (153 / 10)%10 == 5
                int baiwei = (i / 10) / 10; //153如何得到百位1？ (153 / 10)/10 == 1
                if(i == (baiwei*baiwei*baiwei)+(shiwei*shiwei*shiwei)+(geiwei*geiwei*geiwei)){
                    System.out.print(i+" ");
                    count++;
                }
            }
            System.out.println();
            System.out.println("0~999共有 "+count+" 个水仙花数 ");

        }

    }


