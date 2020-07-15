package Practice2;

import java.util.Scanner;

public class practice49 {
    //数字分类
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < arr.length ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(A1(arr)+" "+A2(arr)+" "+A3(arr)+" "+A4(arr)+" "+A5(arr));
    }
    public static int A1(int[] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            if((arr[i] % 5 == 0) && (arr[i] % 2 == 0)){
                sum += arr[i];
            }
        }
        return sum;
    }
    public static int A2(int[] arr){
        int sum = 0;
        int flag = 1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 5 == 1){
                sum += flag*arr[i];
                flag *= -1;
            }
        }
        return sum;
    }
    public static int A3(int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 5 == 2){
                count++;
            }
        }
        return count;
    }
    public static String A4(int[] arr){
        int sum = 0;
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 5 == 3){
                sum += arr[i];//3+8+18=29
                count++;//3
            }
        }
        return  sum/count+"."+(int)((sum % count * 100 / count+5)/10);//为什么是这个式子？？？
    }
    public static int A5(int[] arr){
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 5 == 4){
                if(max < arr[i]){
                    max = arr[i];
                }
            }
        }
        return max;
    }
}
//2、二叉树平衡检查：平衡的定义如下，对于树中的任意一个结点，其两颗子树的高度差不超过1。
class TreeNode0 {
    int val = 0;
    TreeNode0 left = null;
    TreeNode0 right = null;
    public TreeNode0(int val) {
        this.val = val;
    }
}
class Balance {
    public boolean isBalance(TreeNode0 root) {
        // write code here
        if(root == null){
            return true;
        }
        int leftHeight = getTreeHeight(root.left);
        int rightHeight = getTreeHeight(root.right);
        if(Math.abs(leftHeight - rightHeight) > 1){
            return false;
        }
        isBalance(root.left);
        isBalance(root.right);
        return true;
    }

    public int getTreeHeight(TreeNode0 root){
        if(root == null){
            return 0;
        }
        int leftHeight = getTreeHeight(root.left);//左子树的高度
        int rightHeight = getTreeHeight(root.right);//右子树的高度
        return findMax(leftHeight, rightHeight) + 1;
    }
    public int findMax (int a,int b){
        return a > b ? a : b;
    }
}
