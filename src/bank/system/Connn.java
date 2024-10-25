package bank.system;

import java.sql.*;

 class Connn {
    Connection connection;
    Statement statement;
    public Connn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
             connection=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","root");        
             statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}