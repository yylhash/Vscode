package Others;
public class Haskell{
    public static void main(String[] args) {
        System.out.println("乘法口诀表：");
    // 外层循环
    for (int i = 1; i <= 9; i++) {
        // 内层循环
        for (int j = 1; j <= i; j++) {
            System.out.print(j + "*" + i + "=" + j * i + "\t");
        }
        System.out.println();
    }
    }
}