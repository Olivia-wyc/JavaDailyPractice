package Practice2;

//1、this表示当前对象的 引用
//2、this调用构造函数 必须放在构造方法的第一行
//3、这几个构造函数之间的关系是重载:
//4、重载和重写的区别：
// 重载:同一个类中,可以有多个名称相同的方法,只要参数个数或者参数类型不同即可
// 重写:与返回值类型无关,只与参数个数和参数类型有关
//5、静态代码块不管生成多少个对象,其只会执行一次,且是最先执行的.
//  静态代码块执行完毕后,实例代码块（构造块）执行,再然后是构造函数执行。
//6、使用toString 方法将对象自动转化为字符串,但必须要重写toString方法
//  toString 是 Object 类提供的方法,我们自己创建的类默认继承 Object 类,
//  可以重写 toString 方法实现我们自己版本的转换字符串方法.

class Person1{
    public String name;
    public int age;
    public String sex;

    //若不提供构造方法，则系统会自动生成一个无参构造
    public Person1(){
        //无参构造
    }

    public Person1(String name){
        //带有1个参数的构造方法
        this.name = name;
    }

    public Person1(String name,int age){
        //带有2个参数的构造方法
//        this.name = name;
        this(name);
        this.age = age;
    }

    public Person1(String name,int age,String sex){
        //带有3个参数的构造方法
//        this.name = name;
//        this.age = age;
        this(name,age);
        this.sex = sex;
//        this(name,age); error:this调用构造函数 必须放在构造方法的第一行
    }

    public void show(){
        System.out.println("name: "+name+" age: "+age+" sex: "+sex);
    }

}

class Student1{
    public String name;
    public int age;
    public String sex;
    public static int count;

    //3、
    public Student1() {
        //构造函数
        System.out.println("this is constructor");
    }


    //2、构造代码块(实例代码块):定义在类中的代码块 且不加任何修饰(一般用于初始化实例成员变量)

    {
        this.name = "Olivia";
        this.age = 18;
        this.sex = "girl";
        System.out.println("this is construct Code Block");
    }

    // 1、静态代码块:一般用于初始化静态成员属性;不管生成多少个对象，它只执行一次且是最先执行的
    static {
        count = 100;
        System.out.println("this is static Code Block");
    }

    public void show(){
        System.out.println("name: "+name+" age: "+age+" sex: "+sex);
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}


public class Practice12_1 {

    public static void main(String[] args) {
        Student1 stu1 = new Student1();
        System.out.println(stu1);
        //没有调用toString方法打印出来的是一串地址
    }

    public static void main2(String[] args) {
        {
            //普通代码块:定义在方法中的代码块
            int a = 10;
            System.out.println(a);
            System.out.println("this is normal Code Block");
        }
//        System.out.println(a);普通代码块的生命周期:{}里边

        Student1 stu1 = new Student1();
        Student1 stu2 = new Student1();
//        stu1.show();
    }

    public static void main1(String[] args) {
        Person1 per1 = new Person1();
        per1.show();
        Person1 per2 = new Person1("Olivia");
        per2.show();
        Person1 per3 = new Person1("Olivia",18);
        per3.show();
        Person1 per4 = new Person1("Olivia",18,"女");
        per4.show();

    }
}
