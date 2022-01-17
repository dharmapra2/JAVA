// package mca.JDBC;
import java.sql.*;
class stud_details{
    Connection conn=null;
    public stud_details()throws SQLException,ClassNotFoundException{
        Class.forName("com.mysql.cj.jdbc.Driver");//for loading the driver
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","");//here we take java DB from XAMPP server
        System.out.println("XAMPP mysql connected");
    }
    public static void main(String[] args) {
       stud_details obj=null;
       try {
           obj=new stud_details();
           obj.insertData();
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }
       finally{
           try {
               if(obj.conn!=null){
                   obj.conn.close();
               }
           } catch (Exception e1) {
               //TODO: handle exception
               System.out.println(e1.getMessage());
           }
       }
    }//end main method
    void insertData()throws SQLException{
        //we throw sqlexception because Statement java.sql.Connection.createStatement() throws SQLException
        Statement st=conn.createStatement();
        boolean b=st.execute("insert into stud (name,ph_no) values('Dharma',909052288)");
        if(b!=true){
            System.out.println("Row Created...");
        }else{
            System.out.println("Row can't br Create...");
        }
        st.close();
    }//end inserting data into the table
}