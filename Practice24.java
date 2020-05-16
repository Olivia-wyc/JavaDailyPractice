package Practice2;

public class Practice24 {

    /**
     * 相交链表: 编写一个程序，找到两个单链表相交的起始节点。
     * @param headA
     * @param headB
     * @return
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode newHeadA = headA;
        ListNode newHeadB = headB;
        while(newHeadA != newHeadB){
            if(newHeadA == null){
                newHeadA = headB;
            }else{
                newHeadA = newHeadA.next;
            }
            if(newHeadB == null){
                newHeadB = headA;
            }else{
                newHeadB = newHeadB.next;
            }
        }
        return newHeadA;
        //return newHeadB;
    }

    public ListNode getIntersectionNode2(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        ListNode s1 = headA;
        ListNode s2 = headB;
        int size1 = 0;
        int size2 = 0;
        while(s1 != null){
            s1 = s1.next;
            size1++;
        }
        while(s2 != null){
            s2 = s2.next;
            size2++;
        }
        s1 = headA;
        s2 = headB;
        int diff = size1 - size2;
        while(diff > 0){
            //说明size1长，让s1先走diff步
            s1 = s1.next;
            diff--;
        }
        while (diff < 0){
            s2 = s2.next;
            diff--;
        }
        while(s1 != s2){
            s1 = s1.next;
            s2 = s2.next;
        }
        return s1;
    }
}
