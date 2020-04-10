package Practice2;

import java.util.Scanner;

public class Practice9 {

    public static void main6(String[] args) {
        //求解汉诺塔问题(递归)
        System.out.println("请输入一个非负整数");
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.println(hTower(n));
        }
    }
    public static int hTower1(int num){
        if(num == 1){
            return 1;
        }
        return 2*hTower1(num - 1) + 1;
    }

    public static void main5(String[] args) {
        //求解汉诺塔问题(非递归)
        System.out.println("请输入一个非负整数");
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.println(hTower(n));
        }
    }
    public static int hTower(int num){
       int n = (int)Math.pow(2,num);
       int p = n - 1;
       return p;
    }


    public static void main4(String[] args) {
        //实现代码: 青蛙跳台阶问题(提示, 使用递归)
        //一只青蛙一次可以跳上1级台阶，也可以跳上2级.求该青蛙跳上一个N级台阶共有多少种跳法
        System.out.println("请输入一个非负整数");
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.println(frogJump(n));
        }
    }
    public static int frogJump(int num){//5
        if(num == 1){
            return num;
        }
        if(num == 2){
            return num;
        }
        return frogJump(num - 1) + frogJump(num - 2);
    }

}
