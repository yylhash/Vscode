import java.util.Date;


public class Test {
    public static void main(String[] args) {
        try { 
            Date time1 = new Date();
            System.out.println(time1);
            Thread.sleep(1000*3);   // 休眠3秒
            System.out.println(new Date() + "\n"); 
         } catch (Exception e) { 
             System.out.println("Got an exception!"); 
         }
    }
}
