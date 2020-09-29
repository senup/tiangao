package LRU;

/**
 * @Author: 涛哥
 * @Description:
 * @Date: Created in 2020/9/28  18:03
 * @Modified By:
 */
public class Node {
    public int key,val;
    public Node prev,next;
    public Node(int key,int val){
        this.key = key;
        this.val = val;
    }
}
