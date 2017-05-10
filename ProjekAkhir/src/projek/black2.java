package projek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class black2 {

    String name;
    String sex;
    String age;

    


    public black2() {
        name = "";
        sex = "";
        age = "";
    }

    black2(String name, String sex, String age) {
        name = name;
        sex = sex;
        age = age;
    }

    public void student1(String name, String sex, String age) {

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "rootroot");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * from project.patient");

            PreparedStatement preparedStatement = connection.prepareStatement("insert into project.patient (?, ?,?)");
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, sex);
            preparedStatement.setString(3, age);


            preparedStatement.executeUpdate();

        } catch (Exception e) {
            System.out.println("Couldnt get connection");
        }
    }
}
