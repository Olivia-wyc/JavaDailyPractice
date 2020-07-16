package Practice2;

import java.util.Scanner;

public class practice50 {
    //小易的升级之路
    //小易经常沉迷于网络游戏.有一次,他在玩一个打怪升级的游戏,他的角色的初始能力值为 a.在接下来的一段时间内,
    // 他将会依次遇见n个怪物,每个怪物的防御力为b1,b2,b3...bn. 如果遇到的怪物防御力bi小于等于小易的当前能力值c,
    // 那么他就能轻松打败怪物,并 且使得自己的能力值增加bi;如果bi大于c,那他也能打败怪物,但他的能力值只能增加bi 与c的
    // 最大公约数.那么问题来了,在一系列的锻炼后,小易的最终能力值为多少?
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();//怪物的数量
            int a = sc.nextInt();//小易的初始能力值
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();//防御力bi
                if(arr[i] <= a){
                    a += arr[i];
                }else if(arr[i] > a){
                    a += GYSmax(arr[i], a);
                }
            }
            System.out.println(a);
        }
    }
    public static int GYSmax(int a,int b){
        if(a < b){
            for (int i = a; i >= 1; i--) {
                if(a % i == 0 && b % i == 0){
                    return i;
                }
            }
        }else if(a == b){
            return a;
        }else{
            //a > b
            for (int i = b; i >= 1; i--) {
                if(a % i == 0 && b % i == 0){
                    return  i;
                }
            }
        }
        return 0;//没有最大公约数
    }

    //最高分是多少

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int N = sc.nextInt();//学生数
            int M = sc.nextInt();//操作的数目
            int[] stu = new int[N];
            for (int i = 0; i < stu.length; i++) {
                stu[i] = sc.nextInt();
            }
            for (int i = 0; i < M ; i++) {
                String s = sc.nextLine();
                int A = sc.nextInt();
                int B = sc.nextInt();
                if(s.equals("Q")){
                    //询问操作
                    int max = 0;
                    int start = Math.min(A, B);
                    int end = Math.max(A, B);
                    for (int j = start; j < end; j++) {
                        max = Math.max(max, stu[j]);
                    }
                    System.out.println(max);
                }
                if(s.equals("U")){
                    //更新操作
                    stu[A - 1] = B;
                }
            }
        }
    }
    public static int maxGrade(int[] arr,int a,int b) {
        int max = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
            return max;
        }else if(a > b){
            for (int i = b; i <= a; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                }
            }
        }
        return max;
    }
}
