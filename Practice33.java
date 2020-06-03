package Practice2;

import java.util.Scanner;

public class Practice33 {
    //1、读入一个字符串str,输出字符串str中连续最长的“数字串”:
    public static void main1(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一串字符串:");
        while(scanner.hasNext()){
            int count = 0;
            int max = 0;
            int end = 0;
            String s = scanner.nextLine();
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                    count++;//保存每一次字符串中连续数字的个数
                    if(max < count){
                        max = count;//abcd12345ed125ss
                        end = i;//每次的结束位置就是此时的i
                    }
                }else{
                    count = 0;
                }
            }
            System.out.println(s.substring(end-max+1, end+1));
        }
//        String s = scanner.nextLine();
//        System.out.println(longestStr(s));
    }
     // 刚开始我的思路是想直接把连续的数字输出,但是我只能判断是否为数字,却不能判断这些数字
     // 是否是连续的,想了半天也搞不定,后来网上寻求帮助,发现还是要利用 字符串的各种性质来搞
    //这才发现大佬写的代码是利用index来搞的只要求出字符串中 数字 的开始下标和结束下标即可
    //每次也能记录这组数字的长度,最后通过判断长度大小即可,题目要求返回字符串,直接利用String的性质
    public static String longestStr(String str){
        //首先遍历字符串,判断字符是否为数字,若不为数字,则继续遍历,若为数字,求出长度
        //用str.charAt()得到字符串的每一个字符   abcd12345ed125ss
        int count = 0;
        int max = 0;
        int end = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) > '0' && str.charAt(i) < '9'){
                count++;
                if(count > max){
                    max = count;
                    end = i;
                }
            }else{
                count = 0;
            }
        }
        return str.substring(end-max+1, end+1);
//        StringBuffer s = new StringBuffer();
//        while(i <str.length()) {
//            if (str.charAt(i) > '0' && str.charAt(i) <= '9') {
////                    s = s.append(str.charAt(i));
//                count++;
//                if(count > max){
//                    max = count;
//                    end = i;
//                }
//            } else {
//                //遇到的字符串不是数字就继续往下走
//                i++;
//                count = 0;//说明全是字母，没有一个是数字！
//            }
//        }
    }

    public static void main(String[] args) {
        String str1 = "(())()";
        System.out.println(chkParenthesis(str1, 6));
        String str2 = "123(((";
        System.out.println(chkParenthesis(str2, 6));
        String str3 = "(()())";
        System.out.println(chkParenthesis(str3, 6));
    }
    public static boolean chkParenthesis(String A, int n){
        //如果n是奇数，则直接返回fasle；
        if(n % 2 == 1) {
            return false;
        }
        int count = 0;
        for(int i = 0; i < A.length(); i++){
            if(A.charAt(i) != '(' && A.charAt(i) != ')'){
                //先判断该字符串是否完全为括号组成,再判断左右括号是否一一对应
                return false;
            }
            //如果左括号数等于右括号数，则括号匹配合法
            if(A.charAt(i) == '('){
                count++;
            }
            if(A.charAt(i) == ')'){
                count--;
            }
        }
        if(count == 0){
            return true;
        }
            return false;
    }
}
