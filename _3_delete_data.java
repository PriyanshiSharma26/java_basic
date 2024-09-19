import java.sql.*;
 class _3_delete_data {
    public static void main(String[] args)
     {
        String url="jdbc:mysql://localhost:3306/school";
        String user="root";
        String password="1234";
        try{
            
            Connection myConnection= DriverManager.getConnection(url,user,password);
            Statement myStatement=myConnection.createStatement();

            String sql="delete  from student where sno=106";
            myStatement.executeUpdate(sql);
            System.out.println("deletion done......");
            myConnection.close();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
    }
    
}






