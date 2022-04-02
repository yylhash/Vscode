public class replaceString {
    public static void main(String[] args) {
        // 定义原始字符串
        String intro = "今天时星其天，外面时下雨天。妈米去买菜了，漏网在家写作业。" + "语文作业时”其”写 5 行，数学使第 10 页。";
        // 将文本中的所有"时"和"使"都替换为"是"
        String newStrFirst = intro.replaceAll("[时使]", "是");
        // 将文本中的所有"妈米"改为"妈妈"
        String newStrSecond = newStrFirst.replaceAll("妈米", "妈妈");
        // 将文本中的所有"漏网"改为"留我"
        String newStrThird = newStrSecond.replaceAll("漏网", "留我");
        // 将文本中第一次出现的"其"改为"期"
        String newStrFourth = newStrThird.replaceFirst("[其]", "期");
        // 输出最终字符串
        System.out.println(newStrFourth);
    }
}
