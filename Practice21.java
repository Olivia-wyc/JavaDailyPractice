package Practice2;

class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) {
        val = x;
    }



}
class OJ{
    //1、删除链表中的节点:
    // 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    private ListNode first;
    private ListNode last;
    private int size;
    public void deleteNode2(ListNode node){
        if(first == node){
            first = first.next;
        }else{
            ListNode prev = first;
            while(prev.next != null){
                if(prev.next == node){
                    prev.next = prev.next.next;
                    size--;
                    return;
                }else{
                    prev = prev.next;
                }
            }
        }
    }

    /**
     * 2、合并两个有序链表
     * 将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
     * 输入：1->2->4, 1->3->4
     * 输出：1->1->2->3->4->4
     *
     * 先遍历两个链表，并在遍历的同时对两个链表中的数据进行比较，
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1 == null){
            return l2;
        }else if(l2 == null){
            return l1;
        }
        //此时两个链表都不为空,new一个假头
        ListNode newNode = new ListNode(-1);
        ListNode prev = newNode;
        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                prev.next = l1;
                l1 = l1.next;
            }else {
                prev.next = l2;
                l2 = l2.next;
            }//添加一个完成
            prev = prev.next;
        }
        if(l1 == null){
            prev.next = l2;
        }else if(l2 == null){
            prev.next = l1;
        }
        return newNode.next;
    }

    /**
     * 删除排序链表中的重复元素,给定一个'排序'链表，删除所有重复的元素，使得每个元素只出现一次。
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            //空链表或链表中只有一个元素，直接返回head
            return head;
        }
        //两个及两个以上的元素:遍历这个链表
        ListNode tmp = head;
        while(tmp != null && tmp.next != null){
            if(tmp.next.val == tmp.val){
                tmp.next = tmp.next.next;
            }else {
                tmp = tmp.next;
            }
        }
        return tmp;
    }

}
public class Practice21 {
    public static void main(String[] args) {

    }
}
