package homework1;

public class Exchange2 {

    public static void main(String[] args) {
        //给定三个int变量，求其中的最大值和最小值
        int a = 10;
        int b = 20;
        int c = 30;
//      【method 1:】
//        int max,min;
//        if(a > b){
//            max = a;
//        }else{
//            max = b;
//        }
//        if(max < c){
//            max = c;
//        }
//        System.out.println("max:"+max);
//        if(a < b){
//            min = a;
//        }else{
//            min = b;
//        }
//        if(min > c){
//            min = c;
//        }
//        System.out.println("min:"+min);

        //【method 2】
        int max = a > b ? a : b;
        max = max > c ? max : c;
        System.out.println("max:"+max);
        int min = a < b ? a : b;
        min = min < c ? min : c;
        System.out.println("min:"+min);

    }


    public static void main1(String[] args) {
        //给定两个int变量，交换两个变量的值
        int a = 10;
        int b = 20;
        int temp;
        System.out.println("交换前的值:"+a+" "+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("交换后的值:"+a+" "+b);

    }
}
