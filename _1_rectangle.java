//1.	 The perimeter of a rectangle is 230 cm. If the length of the rectangle is 70 cm, find its breadth and area.

                                           //p=2(l+b)
                                           //p=2l+2b
                                           //p=2*70+2b
                                           //230=140+2b
                                           //230-140=2b
                                           //90=2b
                                           //b=45
class rectangle{
    public static void main(String[] args)                             
    {
        int l=70;                                                   
        int p=230;
        
      int b= (p/2)-l;
      int area=l*b;

      System.out.println("breadth is:"+b);
      System.out.println("area is:"+area);
        
    }
}