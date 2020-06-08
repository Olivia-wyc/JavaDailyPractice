package Practice2;

import java.util.Scanner;
import java.util.Stack;

public class Practice35 {
    //1、输入两个正整数A，B，输出它们的最小公倍数；
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入两个正整数:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println(method1(a,b));
    }

    public static int method(int a,int b){
        if(a == 1 || b == 1){
            return a * b;
        }
        int max = a > b ? a : b;
        int min = a < b ? a : b;
        if(max % min == 0) {
            return max;
        }
        return a*b;
    }
    public static int method1(int a,int b){
        int max = a > b ? a : b;
        for (int i = max; ; i++) {
            if(i % a == 0 && i % b == 0){
                return i;
            }
        }
    }
}
 class Solution {
    //队列-->先进先出
    //栈-->先进后出
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);//4321
    }

    public int pop() {
        if(stack2.isEmpty()) {
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());//1234
            }
        }
        return stack2.pop();
    }
}