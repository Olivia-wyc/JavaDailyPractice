package Practice2;

import java.util.Random;
import java.util.Scanner;

public class Practice6{


    public static void main2(String[] args) {
        //输入长方体的长宽高 L,W,H。求体积以及三个面x*y , x*z , y*z的面积;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入长宽高：");
        int L = scanner.nextInt();
        int W = scanner.nextInt();
        int H = scanner.nextInt();
        System.out.println("三个面的面积分别为：");
        System.out.println("x*y="+area(L,W));
        System.out.println("x*z="+area(L,H));
        System.out.println("y*z="+area(W,H));
        System.out.println("该长方体的体积为："+volume(L,W,H));

    }

    /**
     * 求面积
     * @param x
     * @param y
     * @return
     */
    public static int area(int x,int y){
        return x*y;
    }

    /**
     * 求体积
     * @param x
     * @param y
     * @param z
     * @return
     */
    public static int volume(int x,int y,int z){
        return x*y*z;
    }

    public static void main1(String[] args) {
        //猜数字游戏
        Random random = new Random();//获取随机数
        Scanner scanner = new Scanner(System.in);
        int guessNum = random.nextInt(100);
        while(true){
            System.out.println("请在1~100之间选择一个数字：");
            int num = scanner.nextInt();
            if(num < guessNum){
                System.out.println("猜小了");
            }else if(num > guessNum){
                System.out.println("猜大了");
            }else{
                System.out.println("恭喜你，成功猜对！");
                break;
            }
        }

    }
}
