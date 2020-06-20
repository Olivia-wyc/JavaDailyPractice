package Practice2;

import java.util.*;

public class Practice44 {
    //1、火车进站问题(输入车序号，输出所有由这几个数字组成的数)栈
    //需要两个list来存放所有可能的出栈序列(不一定合法)和最终合法的出栈序列
    static List<int[]> list1 = new LinkedList<>();//存放所有可能的出栈序列(不一定合法)
    static List<String> list2 = new LinkedList<>();// 存放最终合法的出栈序列
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();//火车数量
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();//火车数字编号
            }
            outStackQueue(n, arr, 0);
            for (int[] tmp : list1) {//tmp是出栈序列，arr是入栈序列
                if (isLeagle(arr, tmp, n)) {
                    String s = method(tmp, n);//把合法序列变成字典式字符串
                    list2.add(s);
                    //System.out.println();
                }
            }
            Collections.sort(list2);
            for (String s : list2) {
                System.out.println(s);
            }
        }
//        //然后对这几个数字进行排列组合(两层循环)
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i; j < arr.length; j++) {
//                System.out.print(arr[i]+" ");
//            }
//            System.out.println();
//        }
    }
    //判断出栈顺序是否合法.
    public static boolean isLeagle(int[] in,int[] out,int n){
        Stack<Integer> stack = new Stack<>();
        int j = 0;
        for(int i = 0 ; i < n ; i++){
            stack.push(in[i]);
            while(j < n && !stack.isEmpty() && out[j] == stack.peek()){
                stack.pop();//为什么要这一步？-->因为栈为空才能说明顺序是合法的
                j++;
            }
        }
        return stack.isEmpty();
    }
    //求出所有可能的出栈序列
    public static void outStackQueue(int n,int[] arr,int startIndedx){
        if(startIndedx == n-1){
            //说明已经交换完了，不用再交换了，直接将它放入list1中
            int[] tmp = arr.clone();
            list1.add(tmp);
            return;
        }
        //此时数组中有大于1个数字的个数
        for (int i = startIndedx; i < n; i++) {
            swap(arr,i ,startIndedx );
            outStackQueue(n,arr,startIndedx + 1);
            swap(arr, i, startIndedx);
        }
    }
    //交换
    public static void swap(int[] arr,int i,int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    public static String method(int[] arr,int n){
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append(arr[i]);
            if(i != n-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
//    static boolean sb;
//    public String name = "abc";
//    private int a;
//    public static void main(String[] args) {
//        System.out.println(sb);
//        Practice44 p1 = new Practice44();
//        Practice44 p2 = new Practice44();
//        System.out.println(p1.equals(p2)+","+p1.name.equals(p2.name));
//        Practice44 p = new Practice44(88);
//        System.out.println(p.a);
//    }
//
//    Practice44(int b){
//        a = b;
//    }

}
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
class Solutions {
    public void Mirror(TreeNode root) {
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            return ;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        Mirror(root.left);
        Mirror(root.right);
    }
}
