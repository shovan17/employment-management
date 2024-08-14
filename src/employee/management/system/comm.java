package employee.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class comm {

    Connection connection;
    Statement statement;


    public comm(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeemanagement","root", "Net123flix!!");
            statement = connection.createStatement();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

}
