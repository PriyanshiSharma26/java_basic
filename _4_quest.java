// Find the cost of tiling a rectangular plot of land 300 m long and 150 m wide at the rate of $6 per hundred square m. 


public class _4_quest {

    public static void main(String[] args) {
        int plot_len=300;
        int plot_wide=150;

        //rate per hundered sq meter
        int rate_hund_sq_m=6;

        //area in sq metere

        int area_in_sq_m=plot_len*plot_wide;

    // Convert area to hundreds of square meters
      int area_hun_sq_m=area_in_sq_m/100;

      int total_cost=area_hun_sq_m*rate_hund_sq_m;

      System.out.println("tatal cost of tiling is :"+total_cost);


        
        
    }
    
}
