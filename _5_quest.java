//. If it costs 1600 rs. to fence a rectangular park of length 20 m at thrate of 25 rs. per m², find the breadth of the park and its perimeter. Also, find the area of the field.
class _5_quest
{
    public static void main(String[] args) {
        int total_cost_of_fencing=1600;
        int cost_per_meter=25;
        int length=20;

        int total_fencing_length=total_cost_of_fencing/cost_per_meter;
        int perimeter=total_fencing_length;

        int breadth=perimeter/2-length;
        int area=length*breadth;

        System.out.println("primeter of park is:"+perimeter);
        System.out.println("breadth of park is: "+breadth);
        System.out.println("area of park is:"+area);


    }
}