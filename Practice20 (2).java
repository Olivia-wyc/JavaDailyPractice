package Practice2;

//Node类存放节点的具体数值以及下一个节点的地址:
class Node{
    private int data;
    Node next;//存放下一个节点的地址

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

//SingleLinkedList类存放节点的个数以及头节点尾节点
//实现单链表的增删查改:
class SingLinkedList{
    private Node first;
    private Node last;
    private int size;

    /**
     * 尾插法
     * @param data
     */
    public void addLast(int data){
        //先生成一个节点再进行插入;
        Node node = new Node(data,null);
        //先判断是否为空链表
        if(last == null){
            last = first = node;
            size++;
            return;
        }
        //此时链表不是空的
        last.next = node;
        last = node;
        size++;
    }

    /**
     * 头插法
     * @param data
     */
    public void addFirst(int data){
        Node node = new Node(data,null);
        if(first == null){
            first = last = node;
            size++;
            return;
        }
        node.next = node;
        first = node;
        size++;
    }

    /**
     * 任意位置插入
     * @param index
     * @param data
     */
    public void addIndex(int index,int data){
        //判断index的合法性
        if(index < 0 || index > size){
            System.out.println("索引非法！！！");
            return;
        }else if(index == 0){
            //此时为头插
            addFirst(data);
        }else if(index == size){
            //此时为尾插
            addLast(data);
        }else {
            //此时为中间插入(要先找到插入的位置)
            Node node = new Node(data,null);
            //找待插入节点的前驱节点
            Node prev = getIndexNode(index-1);
            node.next = prev.next;
            prev.next = node;
            size++;
        }
    }

    /**
     * 删除第一个值为data的节点
     * @param data
     */
    public void remove(int data){
        //1、先判断链表是否为空
        if(first == null){
            return;
        }else if(first.getData() == data){
            //头节点是待删除节点
            first = first.next;
            size--;
            return;
        }else {
            //2、遍历链表找到待删除节点
            Node prev = first;
            while (prev.next != null) {
                if (prev.next.getData() == data) {
                    prev.next = prev.next.next;
                    size--;
                    break;
                }else{
                    prev = prev.next;
                }
            }
        }
    }

    /**
     *虚拟头节点法:dummyhead
     * 该方法的好处是不用担心待删除节点是头节点;
     * @param data
     */
    public void remove2 (int data){
        //dummyHead肯定不是要删除的节点
        Node dummyHead = new Node(data-1,null);
        dummyHead.next = first;
        Node tmp = dummyHead;
        while(tmp.next != null){
            //tmp.next为待删除节点
            if(tmp.next.getData() ==data) {
                tmp.next = tmp.next.next;
                size--;
                break;
            }else{
                //待删除节点为尾节点
                tmp = tmp.next;
            }
        }
        //为什么？
        first = dummyHead.next;
    }

    /**
     * 删除所有值为data的节点;
     * @param data
     */
    public void removeAll(int data){
        while(first.getData() == data && first != null){
            first = first.next;
            size--;
            return;
        }
        if(first == null){
            return;
        }else {
            Node prev = first;
            while (prev.next != null) {
                if (prev.next.getData() == data) {
                    prev.next = prev.next.next;
                    size--;
                } else {
                    prev = prev.next;
                }
            }
        }
    }

    /**
     * 虚拟头节点法:dummyhead
     * @param data
     */
    public void removeAll2(int data){
        Node dummyHead = new Node(data-1,null);
        dummyHead.next = first;
        Node tmp = dummyHead;
        while(tmp.next != null){
            if(tmp.next.getData() == data){
                tmp.next = tmp.next.next;
                size--;
            }else{
                tmp = tmp.next;
            }
        }
        first = dummyHead.next;
    }

    /**
     * 查看data是否在链表中
     * @param data
     * @return
     */
    public boolean contains(int data){
        Node tmp = first;
        while(tmp != null){
            if(tmp.getData() == data){
                return true;
            }
        }
        return false;
    }

    /**
     * 将index下标的值设置为data
     * @param data
     * @param index
     */
    public void set(int data,int index){
        if(index < 0 || index > size){
            System.out.println("索引非法！！！");
        }
        getIndexNode(index).setData(data);
    }

    /**
     * 根据用户传入的index值在链表中找该index所对应的Node节点
     * (从头结点开始走index步，就找到了index所对应的节点)
     * @param index
     */
    public Node getIndexNode(int index){
        if(index < 0 || index > size){
            System.out.println("索引非法！！！");
        }
        //1->2->3->4->5  (3)
        Node tmp = first;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp;
    }

    public void print(){
        Node tmp = first;
        while(tmp != null){
            System.out.print(tmp.getData()+" ");
            tmp = tmp.next;
        }
    }

}


public class Practice20 {
    public static void main(String[] args) {
        SingLinkedList s = new SingLinkedList();
        Node head = new Node(0,null);
        s.addFirst(1);
        s.addFirst(2);
//        s.addFirst(3);
//        s.addFirst(4);
//        s.addFirst(5);
        s.print();
    }
}
