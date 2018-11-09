import java.sql.*;
public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
    Connection connectionlink = DriverManager.getConnection("jdbc:sqlite:classroom");
    Statement makeStatement = connectionlink.createStatement();
    ResultSet resultSet = makeStatement.executeQuery("SELECT * FROM Teachers,Classes");

            while(resultSet.next())
            {
                String teacherID= resultSet.getString("TeacherID");
                String classID=resultSet.getString("ClassID");
                String Classname= resultSet.getString("ClassName");
                String certainTime =resultSet.getString("Time");


                System.out.println(classID+ " ,"+ Classname +", "+certainTime+ " ,"+" ,"+ teacherID);
            }
    }

}
