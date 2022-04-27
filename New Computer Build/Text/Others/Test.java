package Others;

public class Test {

    public String longestCommonPrefix(String[] strs) {
        String str = "",strC = "";
        int len = strs.length;
        String[][] strCopy = new String[len][];
        for (int i = 0; i < len; i++) {
            strCopy[i] = strs[i].split("");
        }
        for (int j = 0; j < strCopy[j].length; j++) {// 进行列循环
            for (int i = 0; i < len - 1; i++) { // 进行行循环
                if (strCopy[i][j].equals(strCopy[i + 1][j])) {
                    str = strCopy[i][j];
                }else {
                    str = "";
                    break;
                }
            }
            if(str.equals("")){
                break;
            }
            strC +=str;
        }

        return strC;
    }

    public static void main(String[] args) {
        String[] strs = { "flower", "flow", "flight" };
        Test test = new Test();
        System.out.println(test.longestCommonPrefix(strs));
    }
}
