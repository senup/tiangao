package my.self;

/**
 * @Author: 涛哥
 * @Description: 双向链表
 * @Date: Created in 2020/9/28  19:45
 * @Modified By:
 */
public class DoubleList {
    public Node head,tail;
    public int size;

    public DoubleList() {
        this.head = new Node(0,0);
        this.tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
        size=0;
    }

    //头部插入元素  head node ?
    public void addFirst(Node node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
        size++;
    }

    //删除元素head->node->?
    public void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
        size--;
    }

    //删除最后一个元素
    public Node removeLast() {
        if(tail.prev == null) {
            return null;
        }
        Node last = tail.prev;
        remove(last);
        return last;
    }

    public int getSize() {
        return size;
    }
}
