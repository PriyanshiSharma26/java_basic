//3. How many tiles whose length and breadth are 13 cm and 7 cm respectively are needed to cover a rectangular region whose length and breadth are 520 cm and 140 cm?  


public class _3_quest {
    public static void main(String[] args) {
        int region_len=520;
        int region_brea=140;

        int tile_len=13;
        int tile_brea=7;

        int area_of_region=region_len*region_brea;

        int area_of_tile=tile_len*tile_brea;


        int no_of_tiles=area_of_region/area_of_tile;
        System.out.println("toatal tiles are: "+no_of_tiles);



    }
    
}
