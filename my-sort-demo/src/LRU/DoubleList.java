package LRU;

/**
 * @Author: 涛哥
 * @Description:
 * @Date: Created in 2020/9/28  18:09
 * @Modified By:
 */
public class DoubleList {
    public Node head,tail;
    public int size;
    public DoubleList(){
        head = new Node(0, 0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    //在链表头部插入元素
    public void addFirst(Node node) {
        //将节点放到中间
        node.next = head.next;
        node.prev = head;
        //处理两端的节点
        head.next.prev = node;
        head.next = node;
        size++;
    }

    //移除链表的元素
    public void remove(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
        size--;
    }

    // 移除最后一个元素
    public Node removeLast() {
        if(tail.prev == head) {
            return null;
        }
        Node last = tail.prev;
        remove(last);
        return last;//返回删除的元素
    }

    //获取链表的数量
    public int getSize() {
        return size;
    }
}
