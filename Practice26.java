package Practice2;

public class Practice26 {
    /**
     * 二进制链表转整数:
     * 给你一个单链表的引用结点 head。链表中每个结点的值不是 0 就是 1。已知此链表是一个整数数字的
     * 二进制表示形式。请你返回该链表所表示数字的 十进制值 。
     * @param head
     * @return
     */
    public int getDecimalValue(ListNode head) {
//        int sum = 0;
//        int i = 0;
//        ListNode tmp = head;
//        while(tmp != null){
//            sum += tmp.val * Math.pow(2,i);
//            tmp = tmp.next;
//            i++;
//        }
//        return sum;
        if(head == null){
            return 0;
        }
        int sum = 0;
        int count = 0;
        ListNode tmp = head;
        while(tmp != null){
            tmp = tmp.next;
            count++;//1
        }
        tmp = head;
        while(tmp != null && count >= 0 ){
            sum += tmp.val * Math.pow(2,count - 1);
            tmp = tmp.next;
            count--;
        }
        return sum;
    }

    /**
     * 给定一个链表，判断链表中是否有环。
     * 为了表示给定链表中的环,我们使用整数pos来表示链表尾连接到链表中的位置(索引从0开始).
     * 如果pos是-1,则在该链表中没有环.
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(slow != fast){
            if(fast == null || fast.next == null){
                return false;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return true;
    }
}
