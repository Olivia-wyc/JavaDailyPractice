package Practice2;

//abstract class animals{
//    abstract void say();
//}
////如果 cats要继承 animals的话，cats必须也是抽象类，否则编译会出错
//public abstract class cats extends animals{
//    public cats(){
//        System.out.println("im a cat");
//    }
//
//    public static void main(String[] args) {
//        //抽象类不能产生对象，除非重写
//        cats c = new cats() {
//            @Override
//            void say() {
//
//            }
//        };
//    }
//}

import java.util.Scanner;

//    public float amethod(float a,float b){return 0; }
//    public float amethod(float a,float b,float c){return 0;}
//
//
//    static boolean out(char c){
//        System.out.print(c);
//        return true;
//    }
//
//    public static void main(String[] args) {
//        int i = 0;
//        for(out('a');out('b') && i < 2;out('c')){
//            i++;
//            out('d');
//        }
//    }
public class Practice42 {
    //1、和奥巴马一起编程
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        for (int i = 1; i <= n ; i++) {
            System.out.print(s);//输出第一行
        }
        System.out.println();//第一行换行
        //向上取整使用Math.ceil();因为题目要求行数是列数的50%
        //如何输出中间行？
        for (int i = 1; i <= Math.ceil((double)n / 2 - 2) ; i++) {//中间行行数
            System.out.print(s);//打印中间行的第一个字符
            for (int j = 2; j <= n-1; j++) {//n-1是因为除了第一个和最后一个字符中间的字符为空格
                System.out.print(" ");//中间行的其他字符为空格
            }
            System.out.println(s);//中间行最后一个字符
            // (为什么要单独输出第一个字符和最后一个字符呢?)因为最后一个字符输出后要换行
        }
        for (int i = 1; i <= n ; i++) {
            System.out.print(s);//输出最后一个字符
        }

//        for (int i = 1; i <= (n+1)/2 ; i++) {//列间距
//            for (int j = 1; j <= n ; j++) {//行间距
//                System.out.print(s);
//                System.out.println();
//            }
//            System.out.print(s+"");
//            System.out.println();
//        }
    }
    //2、超长整数相加(说明已经超出long了)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        String str = s1.length() > s2.length() ? AddLongInteger1(s1,s2) : AddLongInteger1(s2,s1);
        System.out.println(str);
    }
    //这一步是将字符串数字转换成数字数组,以便于后面进行相加
    public static String AddLongInteger1(String a,String b){
        int alen = a.length();
        int blen = b.length();
        int[] A = new int[alen];
        int[] B = new int[alen];
        for (int i = 0; i < a.length(); i++) {
            A[i] = Integer.parseInt(new StringBuffer().append(a.charAt(i)).toString());
        }
        for (int i = 0; i < b.length(); i++) {
            //搞不懂这一步...
            if(i < alen - blen){
                B[i] = 0;//这步是为什么？
            }
            B[i + alen - blen] = Integer.parseInt(new StringBuffer().append(b.charAt(i)).toString());
            //为什么不直接写成和A数一样的方式
            //B[i] = Integer.parseInt(new StringBuffer().append(b.charAt(i)).toString());
        }
        return AddLongInteger(A,B);
    }
    public static String AddLongInteger(int[] A,int[] B){
        //先准备一个保存两个数组中数字加完后的结果
        int[] result = new int[A.length];
        for (int i = 0; i < B.length; i++) {
            result[i] =  A[i] + B[i];
            //此时能加的已经加完了
        }
        StringBuffer sb = new StringBuffer();
        for (int i = B.length-1; i >= 1 ; i--) {
            if(result[i] >= 10){
                result[i - 1] += 1;
                result[i] -= 10;
            }
            sb.append(result[i]);
        }
        if(result[0] >= 10){
            sb.append(result[0] - 10 + "1");
        }else{
            sb.append(result[0]);
        }
        return sb.reverse().toString();//为什么要reverse? 因为向sb中添加时是倒着添加的
    }
}
