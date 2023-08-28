package Project;
import java.sql.*;

public class ConnectionProvide {
    @SuppressWarnings("CallToPrintStackTrace")
    String url = "jdbc:mysql://localhost:3306/qems";
    String user = "root";
    String pass = "Dn@0021113";
    // function for connecting to database
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qems", "root", "Dn@0021113");
            return con;
        }
        catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    // function for adding new questions
    public void addQuestions(String name, String opt1, String opt2, String opt3, String opt4, String result) {
        System.out.println("reached here");
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, pass);
            if (connection != null){
                Statement statement = connection.createStatement();
                String query = 
                    "INSERT INTO question (question, opt1, opt2, opt3, opt4, result) " +
                    "VALUES ('" + name + "', '" + opt1 + "', '" + opt2 + "', '" + opt3 + "', '" + opt4 + "', '" + result + "')";
                statement.executeUpdate(query); // Use executeUpdate for INSERT, UPDATE, DELETE queries
                System.out.println("Database Connected");
                statement.close();
            }
        } 
        catch (SQLException e) {
            e.printStackTrace();
        } 
        finally {
            try {
                if (connection != null) {
                    System.out.println("Database Disconnected");
                    connection.close();
                }
            } 
            catch (SQLException e) {
                e.printStackTrace();
            }
            
        }
    }
    // function for updating questions
    public void updateQuestion(String id, String name, String opt1, String opt2, String opt3, String opt4, String result) {
        System.out.println("reached here");
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, pass);
            if (connection != null) {
                String query = 
                        "UPDATE question SET question = ?, opt1 = ?, opt2 = ?, opt3 = ?, opt4 = ?, result = ? WHERE id = ?";
                
                PreparedStatement preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, name);
                preparedStatement.setString(2, opt1);
                preparedStatement.setString(3, opt2);
                preparedStatement.setString(4, opt3);
                preparedStatement.setString(5, opt4);
                preparedStatement.setString(6, result);
                preparedStatement.setString(7, id);
                
                preparedStatement.executeUpdate(); // Use executeUpdate for UPDATE queries
                System.out.println("Database Connected");
                
                preparedStatement.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (connection != null) {
                    System.out.println("Database Disconnected");
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
}
}