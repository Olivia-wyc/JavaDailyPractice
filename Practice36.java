package Practice2;

import java.util.Scanner;

public class Practice36 {
    public static void main1(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = scanner.nextInt();
        System.out.println(method1(n));
    }
    public static int method(int n){
        //若n为6和(或)8的倍数，则一定可以恰好买n个苹果
        //若不为6或8的倍数，判断n是否可以拆分成几个6和8的和
        //若n为奇数，则一定不能恰好买
        int count = 0;
        if(n % 2 == 1){
            return -1;
        }
        if(n % 2 == 0){
            while(n == 0){
                n = n % 8;
                count = n;//4
                if(n % 6 == 0){
                    return count+1;
                }else{
                    n = n + 8;
                    if(n % 6 == 0){
                        return count+1;
                    }
                }
            }
        }
        if((n % 6 == 0 && n % 8 == 0) || (n % 8 == 0 && n % 6 != 0) ){
            //既是6的倍数也是8的倍数，一定可以整除，此时返回n/8(因为要返回最少购买的袋数
            return n / 8;
        }
        if(n % 6 == 0 && n % 8 != 0){
            return n / 6;
        }
        return -1;
    }
    public static int method1(int n){
        if(n >= 1 && n <= 100){
            int sum = 0;
            int min = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if(6 * i + 8 * j == n){
                        sum = i + j;
                        if(min == 0){
                            min = sum;
                        }else if(min > sum){
                            min = sum;
                        }
                    }
                }
            }
            if(min == 0){
                return -1;
            }else{
                return min;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        System.out.println(deleteStr(str1,str2));
    }
    public static StringBuffer deleteStr(String str1,String str2){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str1.length(); i++) {
            if(!str2.contains(str1.charAt(i)+"")){
                sb.append(str1.charAt(i));
            }
        }
        return sb;
    }
}
