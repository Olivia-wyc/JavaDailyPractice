package Practice2;

import java.util.Arrays;

public class Practice16 {
    public static void main(String[] args) {
        //合并两个'有序'数组
        int[] arr1 = {0};
        int[] arr2 = {1};
        merge2(arr1,0,arr2,1);
        System.out.println(Arrays.toString(arr1));
    }
//    public static void merge3(int[] nums1, int m, int[] nums2, int n) {
//        int p1 = m-1;
//        int p2 = n-1;
//        int p = m+n-1;
//        while((p1 >= 0) && (p2 >= 0)){
//            nums1[p--] = (nums1[p1] > nums2[p2]) ? nums1[p1--] : nums2[p2--];
//            //若nums2中还有没比较的元素,则直接将nums2中剩下的元素拷贝到nums1当中
//            System.arraycopy(nums2,0,nums1,0,p2+1);
//        }
//    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int[] tmp = new int[m];
        int p1 = 0;
        int p2 = 0;
        int p = 0;
        System.arraycopy(nums1,0,tmp,0,m);
        while((p1 < m) && (p2 < n)){
            nums1[p++] = (tmp[p1] < nums2[p2]) ? tmp[p1++] : nums2[p2++];
//            if(tmp[p1] < nums2[p2]){
//                nums1[p] = tmp[p1];
//                p++;
//                p1++;
//            }else {
//                nums1[p] = nums2[p2];
//                p2++;
//            }
        }
        if(p1 < m){
            //则将p1中剩下的元素拷贝到nums1中去
            System.arraycopy(tmp,p1,nums1,p1+p2,m+n-(p1+p2));
        }
        if(p2 < n){
            //则将p2中剩下的元素拷贝到tmp中去
            System.arraycopy(tmp,p2,nums2,p1+p2,m+n-(p1+p2));
        }
    }
    public static void merge1(int[] nums1, int m, int[] nums2, int n) {
        for(int i = 0 ; i < n; i++){
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    public static void main1(String[] args) {
        //删除排序数组中重复的项(返回删除后数组中元素的个数)
        int[] arr = {1,1,2};
        System.out.println(removeDuplicates(arr));
    }
    public static int removeDuplicates(int[] nums) {
        //判断临界值
        if(nums.length == 0 || nums.length == 1){
            return nums.length;
        }
        //此时数组中有两个或者两个以上的元素
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
//            if(nums[i] == nums[j]){
//                j++;
//            }
        }
        return i + 1;
    }
}

