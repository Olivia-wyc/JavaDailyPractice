package Practice2;

import java.util.Scanner;

public class Practice37 {
    public static void main1(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数,用来表示不同物品的数目:");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        if(n >= 1 && n <= 20){
            for(int i = 1; i <= n; i++){
                int a = scanner.nextInt();
                if(a < 1 || a > 40)
                    break;
            }
        }
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 2;
        System.out.println(addAB(a, b));
    }
    public static int addAB(int A, int B) {
        //二进制 位异或运算 相当于对应位相加，不考虑进位
        //二进制 位与运算 相当于对应位相加之后的进位
        int sum = 0;//对应位的和
        int jinwei = 0;//对应位的和的进位
        while(B != 0) {//为什么是 B 不等于0
            sum = A ^ B;
            jinwei = (A & B) << 1;
            A = sum;
            B = jinwei;
        }
        return sum;
    }

}
