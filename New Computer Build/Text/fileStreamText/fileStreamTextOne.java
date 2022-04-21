package fileStreamText;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class fileStreamTextOne {
    public static void main(String[] args) {
        try{
            byte bWrite[] = {12,13,12,12,12,12};
            OutputStream os = new FileOutputStream("text.txt");
            for(int i = 0;i<bWrite.length;i++){
                os.write(bWrite[i]);
            }
            os.close();

            InputStream is = new FileInputStream("text.txt");
            for(int i = 0;i<is.available();i++){
                System.out.print((char) is.read()+" ");
            }
            is.close();
        }catch(IOException e){
            System.out.println("Exception!!");
        }
    }
    
}
