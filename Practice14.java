package Practice2;

public class Practice14 {


    public static void main(String[] args) {
        //合并排序的数组
        int[] A = {1,2,3,0,0,0};
        int[] B = {2,5,6};
        merge(A,3,B,3);
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+" ");
        }
    }

    public static void merge(int[] A, int m, int[] B, int n) {
        for(int i = 0 ; i < n ; i++){
            A[m+i] = B[i];
            
        }
        sort(A);
    }

    public static void sort(int[] A) {
        for (int i = 0; i < A.length; i++) {
            for (int j = A.length - 1; j > i; j--) {
                if (A[j - 1] > A[j]) {
                    int tmp = A[j - 1];
                    A[j - 1] = A[j];
                    A[j] = tmp;
                }
            }
        }
    }
}
