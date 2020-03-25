import java.util.Scanner;

public class practice2 {
    public static void main1(String[] args) {
        //1. 根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28),中年(29-55),老年(56以上)
        System.out.println("请输入年龄");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age < 18){
            System.out.println("少年");
        }else if(age >= 19 && age < 28){
            System.out.println("青年");
        }else if(age >= 29 && age < 55){
            System.out.println("中年");
        }else{
            System.out.println("老年");
        }
    }

    public static void main2(String[] args) {
        //输出1000-2000之间的所有闰年
        for (int i = 1000; i <= 2000; i++) {
            if(i % 100 == 0){
                //判断是否为世纪闰年
                if(i % 400 == 0){
                    System.out.println(i+" ");
                }
            }else{
                //判断是否为普通闰年
                if(i % 4 == 0){
                    System.out.println(i+" ");
                }
            }
        }
    }

    public static void main(String[] args) {
        //输出乘法口诀表
        //i控制行数；j控制列数
        for(int i = 1 ; i <= 9 ; i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print(j+"*"+i+"="+(i*j)+"  ");
            }
            System.out.println();
        }
    }

}
