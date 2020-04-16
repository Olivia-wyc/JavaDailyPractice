package Practice2;

//1、编写一个类Calculator,有两个属性num1,num2,这两个数据的值，不能在定义的同时初始化，
//最后实现加减乘除四种运算.
class Calculator{
    public int num1;
    public int num2;

    {
        //构造代码块:初始化实例成员变量
        this.num1 = 10;
        this.num2 = 20;
    }

    public int add(){
        return num1 + num2;
    }

    public int subtract(){
        return num1 - num2;
    }

    public int multiplication(){
        return num1 * num2;
    }

    public double division(){
        if(num2 == 0){
            System.out.println("除数非法！");
        }
        return (double)num1 / (double)num2;
    }

}

//2、设计一个包含多个构造函数的类，并分别用这些构造函数来进行实例化对象。
class People{
    public String name;
    public int age;
    public String sex;
    public static int count;

    {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public People(){
        //无参构造
    }

    public People(String name){
        //带有1个参数的构造方法
        this.name = name;
    }

    public People(String name,int age){
        //带有2个参数的构造方法
        this.name = name;
        this.age = age;
    }

    public People(String name,int age,String sex){
        //带有3个参数的构造方法
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void show(){
        System.out.println("name: "+name+" age: "+age+" sex: "+sex);
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}

public class Practice13{

    //3、实现交换两个变量的值。要求：需要交换实参的值
    public int num1 = 10;
    public int num2 = 20;

    @Override
    public String toString() {
        return "Practice13{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                '}';
    }

    public static void main(String[] args) {
        Practice13 p = new Practice13();
        System.out.println("交换前： "+p);
        swap(p);
        System.out.println("交换后： "+p);
    }

    public static void swap(Practice13 p){
        int tmp = p.num1;
        p.num1 = p.num2;
        p.num2 = tmp;
    }

    public static void main3(String[] args) {
        //3、实现交换两个变量的值。要求：需要交换实参的值
        int[] arr = {10,20};
        System.out.println("交换前： "+arr[0] +" "+arr[1]);
        swap(arr);
        System.out.println("交换后： "+arr[0] +" "+arr[1]);
        System.out.println("================================");
    }
    public static void swap(int[] elem){
        int temp = elem[0];
        elem[0] = elem[1];
        elem[1] = temp;
    }

    public static void main2(String[] args) {
        People p1 = new People();
        People p2 = new People("Olivia");
        People p3 = new People("Olivia",18);
        People p4 = new People("Olivia",18,"女");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
    }

    public static void main1(String[] args) {
        Calculator cal = new Calculator();
        System.out.println("num1:"+cal.num1+" num2:"+cal.num2);
        System.out.println("加："+cal.add());
        System.out.println("减："+cal.subtract());
        System.out.println("乘："+cal.multiplication());
        System.out.println("除："+cal.division());
    }
}