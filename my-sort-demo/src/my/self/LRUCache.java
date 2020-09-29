package my.self;

import java.util.HashMap;

/**
 * @Author: 涛哥
 * @Description:
 * @Date: Created in 2020/9/28  19:47
 * @Modified By:
 */
public class LRUCache {
    private DoubleList cache;
    private HashMap<Integer,Node> map;
    private int capacity;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        cache = new DoubleList();
    }

    //获取操作 如果没有返回-1 如果有的话要把链表数据删除再插入到头部
    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        int value = map.get(key).value;
        put(key, value);
        return value;
    }

    public void put(int key, int value) {
        Node node = new Node(key, value);
        //如果包含这个数据 那么删除放到前面
        if (map.containsKey(key)) {
            cache.remove(map.get(key));
            cache.addFirst(node);
            map.put(key, node);
        } else {
            if (capacity == cache.size) {
                cache.removeLast();
            }
            cache.addFirst(node);
            map.put(key, node);
        }
    }
}
