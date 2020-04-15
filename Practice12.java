package Practice2;

//1、类内方法外的变量叫做成员变量(成员属性)-->(保存在对象-->堆)
class Person{
    public String name ;//成员变量(成员属性)
    public int age ;
    public String sex ;

    //构造方法
    public Person(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void show(){
        System.out.println("我叫 "+name+" 今年 "+age+" 岁，是个 "+sex+"  ");
    }

}

// 2、Java中，静态属性和类有关，与具体的实例无关(同一个类的不同属性，可以共用静态属性)
// 3、被static修饰的变量，只有一份(保存在方法区中)
// 4、被static修饰的方法叫 静态方法,不用创建类的实例化对象就可以访问
//所有被static修饰的属性/方法，都不依赖于对象，可以通过类来直接调用
class TestDemo{
    public int a;
    public static int count ;//static修饰属性

    public static void test(){
        //a = 10;error
        count = 100;
    }
}

//1、用private修饰的成员属性或成员方法,不能 直接 被类的调用者所使用
// 必须提供getter和setter方法
//2、this引用，表示调用该方法的对象
class Student{
    private String name;
    private int age;
    private String classes;

    public Student(String name, int age,String classes) {
        this.name = name;
        this.age = age;
        this.classes = classes;
    }

    public void setName(String name){
        this.name = name;//当前对象的引用
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public void show(){
        System.out.println("我叫 "+name+" 今年 "+age+" 岁，在 " + classes+" 班");
    }
}

public class Practice12 {

    public static void main(String[] args) {
        Student stu1 = new Student("Olivia",18,"2");
        //stu1.name = "001" error:
        stu1.show();

    }


    public static void main2(String[] args) {

        TestDemo t1 = new TestDemo();
        t1.a++;
        TestDemo.count++;//静态属性，直接通过类来调用
        System.out.println("t1.a = "+t1.a + "       " +"count = " +TestDemo.count );
        TestDemo t2 = new TestDemo();
        t2.a++;
        TestDemo.count++;
        System.out.println("t2.a = "+t2.a + "       " +"count = " +TestDemo.count );
        System.out.println("=========================================");
        TestDemo.test();
        System.out.println("count: "+TestDemo.count);
    }

    public static void main1(String[] args) {
        Person person1 = new Person("zs",18,"girl");
//        Person person = new Person();
//        System.out.println(person.age);
//        System.out.println(person.name);
//        System.out.println(person.sex);
        person1.show();
        Person person2 = new Person("ls",20,"boy");
//        person2.name = "aaa";
//        person2.sex = "男";
//        person2.age = 20;
        person2.show();
        System.out.println();

    }

}
