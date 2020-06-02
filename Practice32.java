package Practice2;

import java.util.Scanner;

public class Practice32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println(method(a, b));
//        StringBuffer sb = new StringBuffer("helloworld");
//        System.out.println(sb.insert(0, "你好"));
    }
    public static int method(String A,String B){
        //将字符串B插入到字符串A中，使之成为回文串，并返回有多少种方法
//        int a = A.length();
//        int b = B.length();
        int count = 0;
        StringBuffer sb = new StringBuffer(A);
        StringBuffer sb1 = new StringBuffer();
        for (int i = 0; i < A.length()-1; i++) {
            sb1 = sb.insert(i, B);
            //每插入一次,判断插入后的字符串是否为回文串,若是回文串,就让count++;
            if(sb1.reverse().equals(sb)){
                count++;
            }
        }
        return count;
    }

}
