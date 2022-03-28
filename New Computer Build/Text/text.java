class Text{
   public static String getType(Object test) {
		return test.getClass().getName().toString();
					
	}
  public static void main(String[] args) {
   int c = 12;
   System.out.println(c);
   System.out.println("c <<= 2 = " + c );
   c >>= 2 ;
   System.out.println("c >>= 2 = " + c );
   c >>= 2 ;
     System.out.println("hello World!");
  }
}