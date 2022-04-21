package Others;
public class twoArray{
    public static void main(String[] args) {
        int[][] intArray = new int[10][10];
        for(int i = 0;i < intArray.length;i++){
            for(int j = 0;j < intArray[i].length;j++){
                intArray[i][j] = (int)(Math.random() * 10);
            }
        }

        for(int[] arrayList : intArray){//for-each循环
            for(int a : arrayList){
                System.out.print(a + "\t");
            }
            System.out.println();
        }
        System.out.println("**********");
        for(int i = 0;i < intArray.length;i++){
            for(int j = 0;j < intArray[i].length;j++){
                System.out.print(intArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}