package Practice2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Practice19 {
    public static void main(String[] args) {
        //给定一个整数数组和一个整数 k, 你需要在数组里找到k-diff 数对.
        //这里将k-diff数对定义为一个整数对(i, j)其中i和j都是数组中的数字,且两数之差的绝对值是k.
        //输入: [3, 1, 4, 1, 5], k = 2
        //输出: 2
        //解释: 数组中有两个 2-diff 数对, (1, 3) 和 (3, 5)。
        //尽管数组中有两个1，但我们只应返回不同的数对的数量。
        int[] arr = {1,1,1,1,1};
        System.out.println(findPairs(arr, 0));
    }

    public static int findPairs(int[] nums, int k) {

        int count = 0;
        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(Math.abs(nums[i] - nums[j])== k){
                    if(set.contains(nums[i] + nums[j]))
                        continue;
                    set.add(nums[i] + nums[j]);
                    count++;
                }else if(Math.abs(nums[i] - nums[j]) > k){
                    break;
                }
            }
        }
        return count;
    }
}
