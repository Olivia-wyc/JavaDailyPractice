package Practice2;

import java.util.Scanner;

public class Practice31 {
    //有这样一道智力题:"某商店规定:三个空汽水瓶可以换一瓶汽水.小张手上有十个空汽水瓶,她最多可以换
    // 多少瓶汽水喝?"答案是5瓶,方法如下:先用9个空瓶子换3瓶汽水,喝掉3瓶满的,喝完以后4个空瓶子,用3个再
    // 换一瓶,喝掉这瓶满的,这时候剩2个空瓶子.然后你让老板先借给你一瓶汽水,喝掉这瓶满的,喝完以后用3个空
    // 瓶子换一瓶满的还给老板,如果小张手上有n个空汽水瓶,最多可以换多少瓶汽水喝?
    public static void main1(String[] args) {
        System.out.println("请输入一个整数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int tmp = meyhod(n);
        System.out.println(tmp);
    }

    public static int meyhod(int n){
        int sum = 0;
        if(n == 0){
            return 0;
        }else {
            int i = n % 3;//
            int j = (n - i) / 3;//每次喝汽水的数量
            n = i + j;
            int k = 3 - n;
            if (k > 0) {
                n += k;
            }
            sum += j;//总共喝汽水的数量3+1
        }
        meyhod(n);
        // n 代表自己所拥有的空水瓶
        //该放方法用来计算最多可以喝多少瓶汽水
//        int sum = 0;
//        while(n != 0){
////            n = (n - ( n % 3))/3;//每次可以喝的瓶数
//            int i = n % 3;//
//            int j = (n - i)/3;//每次喝汽水的数量
//            n = i + j;
//            int k = 3 - n;
//            if(k > 0){
//                n += k;
//            }
//            sum += j;//总共喝汽水的数量3+1
//        }
////        if(n == 0){
////            return n;
////        }else{
////            n = (n - ( n % 3))/3;//第一次可以喝的瓶数
////        }
       return sum;
    }
    /**
     * int sum = 0;
     *        while(n != 0){
     *           int i = n % 3;//
     *           int j = (n - i)/3;//每次喝汽水的数量
     *           n = i + j;
     *           int k = 3 - n;
     *           if(k > 0){
     *               n += k;
     *           }
     *           sum += j;//总共喝汽水的数量3+1
     *        }
     *         return sum;
     */
    public static void main(String[] args) {
        //有一-组数,对于其中任意两个数组,若前面一个大于后面一个数字,则这两个数字组成一个逆序对.
        // 请设计一个高效的算法,计算给定数组中的逆序对个数.
        //测试样例:
        //[1,2,3,4,5,6,7,0],8
        //返回: 7
        int[] arr = {1,2,3,4,5,6,7,0};
        int n = 8;
        System.out.println(count(arr, n));
    }
    public static int count(int[] A, int n){
        int count = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(A[i] > A[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
