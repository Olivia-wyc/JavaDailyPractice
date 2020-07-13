package Practice2;

import java.util.Scanner;

public class practice47 {
    //有一只兔子，从出生后第3个月起每个月都生一只兔子，小兔子长到第三个月后每个月又生一只兔子，
    // 假如兔子都不死，问每个月的兔子总数为多少？
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    }
    //输入第几个月月份数，输出兔子个数（递归？）
    public static int getTotalCount(int monthCount)
    {
        if(monthCount <= 2){
            return 1;
        }
        return getTotalCount(monthCount-1) + getTotalCount(monthCount - 2);
    }
    //消息加密的办法是：对消息原文中的每个字母，分别用该字母之后的第5个字母替换（例如：消息原文中的每个字母A 都分别
    // 替换成字母F），其他字符不 变，并且消息原文的所有字母都是大写的。密码中的字母与原文中的字母对应关系如下。
    //密码字母：A B C D E F G H I J K L M N O P Q R S T U V W X Y Z
    //原文字母：V W X Y Z A B C D E F G H I J K L M N O P Q R S T U
    public static void main(String[] args) {
        //知道密文，求原文
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            char[] ch = str.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                char c = ch[i];
                if('A' <= ch[i]){
                    c = (char)((c > 'E') ? (c - 5) : (c + 21));
                    ch[i] = c;
                }
            }
            System.out.println(ch);
        }
    }
}
