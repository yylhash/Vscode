package StringBuffer;
class SplitOne{
  public static void main(String[] args) {
   String s = "hodfop = dfsf:fasdf:dfasfas:dfsadf";
   String str = "";
   int i = 0;
   while(i<s.length()){
      if(s.charAt(i)==':'||s.charAt(i)=='='){
         // if(!"dfsf".equals(str.trim())){
            System.out.println(str);
         // }
         str="";
       }
      if(s.charAt(i)!='='&&s.charAt(i)!=':'){
         str+=s.charAt(i);
      }
   i++;
   }
   System.out.println(str);
  }
}