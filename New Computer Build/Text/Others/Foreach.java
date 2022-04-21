package Others;
public class Foreach {
    public static void main(String[] args) {
        String[] urls = { "http://c.biancheng.net/java", "http://c.biancheng.net/c", "http://c.biancheng.net/golang/" };
// 使用foreach循环来遍历数组元素
// 其中book将会自动迭代每个数组元素
for (String url : urls) {
    System.out.println(url);
}

    }
}
