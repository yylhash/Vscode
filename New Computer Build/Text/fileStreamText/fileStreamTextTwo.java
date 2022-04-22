package fileStreamText;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class fileStreamTextTwo {
    public static void main(String[] args) throws IOException {
        File f = new File("a.txt");
        // FileOutputStream os = new FileOutputStream(f);
        //创建一个输出流对象 os 文件不存在 将会自动创建

        // OutputStreamWriter writer = new OutputStreamWriter(os, "UTF-8");
        
        // writer.append("中文输入");
        // writer.append("\r\n");
        // writer.append("English");
        // writer.close();
        // os.close();

        FileInputStream is = new FileInputStream(f);
        //创建输入流对象 is 

        InputStreamReader reader = new InputStreamReader(is,"UTF-8");
        StringBuffer str = new StringBuffer();
        while(reader.ready()){
            str.append((char) reader.read());
            //转成char加入到 StringBuffer 对象中 
        }
        System.out.println(str.toString());
        reader.close();
        is.close();
    }
    
}
