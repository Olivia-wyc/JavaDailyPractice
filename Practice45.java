package Practice2;

import java.util.HashMap;
import java.util.Scanner;
import static java.lang.Math.*;

public class Practice45 {
    //1、百万富翁问题
    public static void main1(String[] args) {
        int stranger = 0;
        int richman = 0;
        for(int i = 1;i <= 30;i++){
            stranger += 10;
            richman += (long)pow(2, i-1);
        }
        System.out.println(stranger+"万元"+richman+"分");
    }
    //2、DNA序列问题
    public static void main(String[] args) {
        HashMap map = new HashMap();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();//DNA序列
        int len = sc.nextInt();//最小子序列长度
        int max = 0;//记录结果字串的起始下标
        int[] count = new int[str.length() - len];//为什么-->因为若不减len的话,会抛出异常,所以必须在遍历最后5个(最后一次)时停止
        for (int i = 0; i < str.length() - len; i++) {
            String r = str.substring(i, i+len);
            for (int j = 0; j < len; j++) {//比较哪每五个里的C、G最多
                if(r.charAt(j) == 'C' || r.charAt(j) == 'G'){
                    count[i]++;//统计C、G个数并保存在count数组中
                }
            }
            if(count[i] > count[max]){
                max = i;
            }
        }
        String tmp = str.substring(max, max+len);
        System.out.println(tmp);
    }
}
