import java.sql.*;

public class _2_insert_data {
    public static void main(String[] args)
     {
        String url="jdbc:mysql://localhost:3306/school";
        String user="root";
        String password="1234";
        try{
            
            Connection myConnection= DriverManager.getConnection(url,user,password);
            Statement myStatement=myConnection.createStatement();

            String sql="insert into neworder"+"(order_id,customer_id,order_date)"+"values(5,5,'2024-10-20')";
            myStatement.executeUpdate(sql);
            System.out.println("insertion done......");
            myConnection.close();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    
}
