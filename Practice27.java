package Practice2;

import org.omg.PortableServer.LIFESPAN_POLICY_ID;

import java.util.List;

public class Practice27 {
    //1、删除链表中所有给定元素:
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return head;
        }
        while (head.val == val) {
            head = head.next;
            return head;
        }
        ListNode prev = head;
        while (prev.next != null) {
            if (prev.next.val == val) {
                prev.next = prev.next.next;
            }
            prev = prev.next;
        }
        return head;
    }

    //2、反转链表:
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = head;
        while (head != null && head.next != null) {
            ListNode node = new ListNode(newHead.next.val);
            //头插法:
            node.next = newHead;
            newHead = node;
            head = head.next;
        }
        return newHead;
    }

    //3、返回链表中间节点
    public ListNode middleNode(ListNode head) {
        if (head == null) {
            return head;
        }
        int count = 0;
        ListNode tmp = head;
        while (tmp != null) {
            tmp = tmp.next;
            count++;
        }
        tmp = head;
        int i = 0;
        while (tmp != null && i < count / 2 + 1) {
            tmp = tmp.next;
            i++;
        }
        return tmp;
    }

    //4、倒数第K个节点:
    public ListNode kPoint(ListNode head, int k) {
        if (head == null) {
            return head;
        }
        ListNode tmp = head;
        int count = 0;
        while (tmp != null) {
            tmp = tmp.next;
            count++;
        }
        tmp = head;
        int i = 0;
        while (tmp != null && i < count - k + 1) {
            tmp = tmp.next;
            i++;
        }
        return tmp;
    }

    //5、合并两个有序链表:
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        ListNode dummyHead = new ListNode(0);
        ListNode tmp = dummyHead;
        while (l1 != null || l2 != null) {
            if (l1.val <= l2.val) {
                tmp.next = l1;
                l1 = l1.next;
            } else {
                tmp.next = l2;
                l2 = l2.next;
            }
        }
        if (l1 == null) {
            tmp.next = l2;
        } else if (l2 == null) {
            tmp.next = l1;
        }
        return dummyHead.next;
    }

    //6、给定一个链表，判断链表中是否有环。
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (true) {
            if (fast == null || fast.next == null) {
                //这个条件是为了防止无环情况的出现（链表中有 两个以上的无环结构）
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast)
                break;
        }
        return true;
    }

    //7、编写一个程序，找到两个单链表相交的起始节点。
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode A = headA;
        ListNode B = headB;
        int count1 = 0;
        int count2 = 0;
        while (A != null) {
            A = A.next;
            count1++;
        }
        while (B != null) {
            B = B.next;
            count2++;
        }
        int count = count1 - count2;
        A = headA;
        B = headB;
        while(count > 0){
            A = A.next;
            count--;
        }
        while(count < 0){
            B = B.next;
            count++;
        }
        while (A != B) {
            A = A.next;
            B = B.next;
        }
        return A;
    }

    //8、链表的回文结构(判断链表是不是回文链表)
    //1-->2-->2-->1
    public boolean chkPalindrome(ListNode A) {
        if(A == null || A.next == null){
            return false;
        }
        //1、求出链表长度
        ListNode tmp = A;
        int count = 0;
        while(A.next != null){
            A = A.next;
            count++;
        }
        tmp = A;
        //找到后半部分的头节点；
        for (int i = 1; i <= count/2+1; i++) {
            A = A.next;
        }
        //反转后半部分；
        reverseList(A);
        //对比前半部分和后半部分值是否一致
        int i = 1;
        int j = 2/count;
        while(tmp.val == A.val){
            tmp = tmp.next;
            A = A.next;
        }
        return true;
    }
    public boolean isPalindrome1(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode tmp = head;
        int size = 0;
        while(tmp != null){
            size++;
            tmp = tmp.next;
        }
        //int avgSize = size/2;
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            //1-->2-->2-->1
            if(arr[i] == arr[size - 1 - i]){
                return true;
            }
            return false;
        }
        return false;
    }

    //9、删除链表中的重复节点
    public ListNode removeAll(ListNode head,int val){
        if(head == null){
            return head;
        }
        while(head.val == val){
            head = head.next;
            return head;
        }
        ListNode tmp = head;
        while(tmp.next != null){
            if(tmp.next.val == val){
                tmp.next = tmp.next.next;
            }
        }
        return tmp;
    }
}

