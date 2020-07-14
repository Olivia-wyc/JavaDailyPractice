package Practice2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class practice48 {
    //到底买不买问题
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sell = sc.next();//摊主
        String buy = sc. next();//顾客
        Map<Character,Integer> map = new HashMap<>();//用来存放珠子的个数以及颜色
        char[] chS = sell.toCharArray();
        for (int i = 0; i < chS.length; i++) {
            if(map.containsKey(chS[i])){
                int count = map.get(chS[i]);//先看珠子出现了几次
                map.put(chS[i],count+1);
            }else{
                //第一次出现
                map.put(chS[i],1);
            }
        }
        char[] chB = buy.toCharArray();
        int count1 = 0;//用来记录sell中缺少珠子的个数
        for (int i = 0; i < chB.length; i++) {
            if(map.containsKey(chB[i])){
                if(map.get(chB[i]) > 0){
                    int count = map.get(chB[i]);
                    map.put(chB[i],count-1);//修改它的个数
                }else{
                    count1++;
                }
            }else{
                count1++;
            }
        }
        if(count1 == 0){
            System.out.println("Yes"+ (sell.length()-buy.length()));
        }else{
            System.out.println("No" + count1);
        }
    }
    //    //买珠子,如果是yes --> sell.length()-buy.length();如果是no --> buy.length()-count;
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String sell = sc.next();//more
//        String buy = sc. next();//less
//        int count = 0;
//        char[] chS = sell.toCharArray();//more
//        //char[] chB = buy.toCharArray();//less
//        for (int i = 0; i < buy.length(); i++) {
//            if(){
//                //若buy的珠子在sell中
//                count++;
//            }
//        }
//    }

}
class ListNode0 {
    int val;
    ListNode0 next = null;

    ListNode0(int val) {
        this.val = val;
    }
}
public class Plus {
    //{1,2,3},{3,2,1}
    //返回：{4,4,4}
    public ListNode0 plusAB(ListNode0 a, ListNode0 b) {
        // write code here
        if(a == null){
            return  b;
        }
        if(b == null){
            return a;
        }
        ListNode0 dummyHead = new ListNode0(-1);
        while(a.next != null && b.next != null){
            dummyHead.next.val = a.val + b.val;
            a = a.next;
            b = b.next;
            dummyHead = dummyHead.next;
        }
        if(a.next != null){
            dummyHead.next = a;
        }
        if(b.next != null){
            dummyHead.next = b;
        }
        return dummyHead.next;
    }
}
