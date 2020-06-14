package Practice2;

import java.util.Scanner;

public class Practice40 {
    //1、最小步数变为斐波那契数列
    public static void main(String[] args) {
        //0 1 1 2 3 5 8
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();//8
        int f1 = 0;
        int f2 = 1;
        int f = 0;
        while(f2 < N){//1 2 3 5 8
            f = f1 + f2;//1 2 3 5 8
            f1 = f2;//1 1 2 3 5
            f2 = f;//1 2 3 5 8
            //此时N处于f2和f1之间
        }
        if(Math.abs(f1 - N) < Math.abs(f2 - N)){
            System.out.println(Math.abs(f1 - N));
        }else{
            System.out.println(Math.abs(f2 - N));
        }
    }

    //2、机器人走方格！
    public int countWays(int x, int y) {
        // X 表示行 Y 表示列
        int count = 0;
        for (int i = 0; i <= x ; i++) {
            for (int j = 0; j <= y ; j++) {

            }
        }
        return count;
    }
}
