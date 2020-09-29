package LRU;

import java.util.HashMap;



/**
 * @Author: 涛哥
 * @Description:
 * @Date: Created in 2020/9/28  18:00
 * @Modified By:
 */
public class LRUCache {
    private int capacity;
    private HashMap<Integer,Node> map;
    private DoubleList cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        map = new HashMap<>();
        cache = new DoubleList();
    }

    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }
        int val = map.get(key).val;//使用哈希表的话更快
        put(key, val);//删除掉现在的key 然后放在表头
        return val;
    }

    public void put(int key, int val) {
        Node node = new Node(key,val);
        if (map.containsKey(map.get(key))) {//如果存在这个key 删除放队首
            cache.remove(map.get(key));
            cache.addFirst(node);
            map.put(key, node);
        }else{
            if (capacity == cache.getSize()) {//没有包含这个key 放在最前面
                //再考虑删除最后一个元素和维护哈希表
                Node last = cache.removeLast();
                map.remove(last.key);
            }
            cache.addFirst(node);
            map.put(key, node);//哈希表的添加操作
        }
    }

}
