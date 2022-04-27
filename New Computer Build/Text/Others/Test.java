package Others;

public class Test {

    public int romanToInt(String s) {
        String[] str = s.split("");
        int len = str.length;
        int[] num = new int[len];
        int number = 0, j = 0;
        // 一般情况下
        for (int i = 0; i < len; i++) {
            if (str[i].equals("I")) {
                if (i + 1 != len) {
                    if (str[i + 1].equals("V")) { // 特殊情况"4"
                        num[j] = 4;
                        i++;
                    } else if (str[i + 1].equals("X")) { // 特殊情况"9"
                        num[j] = 9;
                        i++;
                    }
                    else {
                        num[j] = 1;
                    }
                } else {
                    num[j] = 1;
                }

            } else if (str[i].equals("V")) {
                num[j] = 5;
            } else if (str[i].equals("X")) {
                if (i + 1 != len) {
                    if (str[i + 1].equals("L")) { // 特殊情况"40"
                        num[j] = 40;
                        i++;
                    } else if (str[i + 1].equals("C")) { // 特殊情况"90"
                        num[j] = 90;
                        i++;
                    }
                    else {
                        num[j] = 10;
                    }
                } else {
                    num[j] = 10;
                }

            } else if (str[i].equals("L")) {
                num[j] = 50;
            } else if (str[i].equals("C")) {
                if (i + 1 != len) {
                    if (str[i + 1].equals("D")) { // 特殊情况"400"
                        num[j] = 400;
                        i++;
                    } else if (str[i + 1].equals("M")) { // 特殊情况"900"
                        num[j] = 900;
                        i++;
                    }
                    else {
                        num[j] = 100;
                    }
                } else {
                    num[j] = 100;
                }

            } else if (str[i].equals("D")) {
                num[j] = 500;
            } else if (str[i].equals("M")) {
                num[j] = 1000;
            }
            j++;
        }
        // 将单个数字加起来
        for (int i = 0; i < j; i++) {
            number += num[i];
        }
        return number;
    }

    public static void main(String[] args) {
        String str = "III";
        Test test = new Test();
        System.out.println(test.romanToInt(str));
    }
}
