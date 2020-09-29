package test.Main;

/**
 * @Author: 涛哥
 * @Description:
 * @Date: Created in 2020/9/20  21:16
 * @Modified By:
 */
public class Main {
    public static void main(String[] args) {
        boolean judge = judge("AbcDE", "ABDE", 1);
        System.out.println(judge);
    }

    public static boolean judge(String a, String b, int query) {
        String longStr;
        String shortStr;
        //选出长度较小的字符串
        if (a.length() > b.length()) {
            longStr = a;
            shortStr = b;
        }else{
            longStr = b;
            shortStr = a;
        }
        int i=0;
        int j;
        for (j = 0; j < longStr.length(); j++) {
            if (shortStr.charAt(i) == longStr.charAt(j)) {
                i++;
                j++;
            } else if (longStr.charAt(i) +32 == shortStr.charAt(j)) {
                query--;
                if (query < 0) {
                    return false;
                }
            }else{
                j++;
            }
        }
        return i==shortStr.length();
    }
}
