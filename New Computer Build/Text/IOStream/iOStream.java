package IOStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class iOStream {
    public static void main(String[] args) throws IOException {
        char ch;
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入字符，按下字符“Q”退出");
        do{
            ch = (char) read.read();
            System.out.println(ch);
        }while(ch != 'Q');
    }
    
}
