// The area of a rectangle is 96 cm². If the breadth of the rectangle is 8 cm, find its length and perimeter. 


public class _2_rectangle { 
    public static void main(String[] args) {
        int len;
        int area=96;
        int brea=8;
        len=area/brea;
        int peri=(len+brea)*2;
        System.out.println(" length of rectangle is:"+len);
        System.out.println("perimeter of rectangle is:"+peri);
    }
    
}
