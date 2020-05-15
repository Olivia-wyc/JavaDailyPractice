package Practice2;

class ListNode2 {
    int val;
    ListNode2 next;

    public ListNode2(int x) {
        val = x;
    }
}

public class Practice23 {
    /**
     * 1、从尾到头打印链表:
     * 输入一个链表的头节点，从尾到头反过来返回每个节点的值(用数组返回)
     * @param head
     * @return
     */
    public int[] reversePrint(ListNode head) {
            //先把链表反转一下,新建一个数组,长度是链表长度
            ListNode newHead = new ListNode(head.val);
            while(head.next != null){
                ListNode node = new ListNode(head.next.val);
                node.next = newHead;
                newHead = node;
                head = head.next;
            }
            ListNode tmp = newHead;
            int size = 0;
            while(tmp != null){
                tmp = tmp.next;
                size++;
            }
            int[] arr = new int[size];
            int i = 0;
            while(i < size){
            arr[i] = head.val;
            i++;
            head = head.next;
        }
        return arr;
    }

    public int[] reversePrint2(ListNode head) {
        ListNode tmp = head;
        int size = 0;
        while(tmp != null){
            size++;
            tmp = tmp.next;
        }
        int[] arr = new int[size];
        //为什么要将head重新赋值给tmp?-->因为第一次遍历链表结束时，tmp在链表的最后一个节点处，
        // 而下面的操作还要使用到tmp,所以要将tmp ’初始化‘
        tmp = head;
        //因为最后返回的是反转链表，要么先将链表反转一遍，要么用for循环从链表尾节点开始倒着赋值，
        // 显然第二个更容易一些
        for(int i = size - 1 ; i >= 0 ; i--){
            arr[i] = tmp.val;
            tmp = tmp.next;
        }
        return arr;
    }

    /**
     * 2、请判断一个链表是否为回文链表(回文链表)
     * 先求出链表长度size，如果它是回文链表，则长度一定是偶数，然后让长度size/2，
     * 比较链表第一个节点的值和size/2 + 1处的值，若相等则是回文链表，反之则不是
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode tmp = head;
        int size = 0;
        while(tmp != null){
            size++;
            tmp = tmp.next;
        }
//        int avgSize = size/2;
        int[] arr = new int[size];
//        int i = 0;
//        while(i < arr.length){
//            if(arr[0] == arr[size-1]){
//                return true;
//            }
//        }

        for (int j = 0; j < arr.length; j++) {
            //1-->2-->2-->1
            if(arr[j] == arr[size - 1 - j]){
                return true;
            }
            return false;
        }
        return false;
    }
}
