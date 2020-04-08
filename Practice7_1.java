package Practice2;

public class Practice7_1 {
    public static void main4(String[] args) {
        int a = 10;
        int b = 20;
        int ret1 = add(a,b);
        System.out.println(ret1);

        double c = 2.5;
        double d = 3.7;
        double ret2 = add(c,d);
        System.out.println(ret2);

        double e = 5.8;
        double f = 7.5;
        double g = 3.6;
        double ret3 = add(e,f,g);
        System.out.println(ret3);
    }
    //方法重载：对同一个类，方法名称相同，但参数的个数和类型不同，与返回值无关
    public static int add(int x,int y){
        return x+y;
    }
    public static double add(double x,double y){
        return x+y;
    }
    public static double add(double x,double y,double z){
        return x+y+z;
    }


    public static void main3(String[] args) {
        int[] array = {10,20};
        swap2(array);//此时就可以交换了，这是为什么呢？
        System.out.println(array[0]);
        System.out.println(array[1]);
    }
    public static void swap2(int[] array){
        int tmp = array[0];
        array[0] = array[1];
        array[1] = tmp;
    }

    public static void main2(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b); //这个过程中并没有真正交换a和b的值
        System.out.println(a);
        System.out.println(b);

//        int a = 10;
//        int b = 20;
//        int x = a;
//        int y = b;
//        int tmp =x;
//        x = y;
//        y = tmp;
//        System.out.println(a);
//        System.out.println(b);
//        //这个过程中并没有交换a和b的值
    }

    public static void swap(int x,int y){
        int tmp = x;
        x = y;
        y = tmp;
    }

    public static void main1(String[] args) {
        //计算1! + 2! + 3! + 4! + 5!(使用方法)
        int sum = 0;
        for (int i = 1; i <=5 ; i++) {
            sum +=  factor(i);
        }
        System.out.println(sum);
    }
    public static int factor(int i){
        int num = 1;
        for (int j = 1; j <= i ; j++) {
            num *= j;
        }
        return num;
    }
}
