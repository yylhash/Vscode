package StringBuffer;
public class splitThree {
    public static void main(String[] args) {
        // 定义存储新闻标题的数组
        String[] news = new String[] { "如何快速掌握Java", "听老王剖析Java中的运算符", "学习Java的十大忠告", "你所不知道的java网络编程技巧大全", "Java面试题大全" }; 
        String title = "************* 新闻列表 *************";
        System.out.println(title.substring(10, 30));
        System.out.println("----------------------------------------------");
        /*
         * 循环遍历数组截取数组元素中的前10个字符作为列表展示
         */
        for (int i = 0; i < news.length; i++) {
            // 判断数组元素的长度是否大于10，如果大于，则截取，否则全部显示
            if (news[i].length() > 10) {
                System.out.println(news[i].substring(0, 10) + "…");
            } else {
                System.out.println(news[i]);
            }
        }
    }
    
}
