package sql;
import java.sql.*;
import java.util.Scanner;
// new mysqlsample
public class MysqlSample {
    private Connection con;

    public MysqlSample(String databaseUrl, String username, String password) {
        try {
            con = DriverManager.getConnection(databaseUrl, username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void closeConnection() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ResultSet fetchAndPrintEmployeeInfo() {
        ResultSet resultSet1 = null;
        if (con == null) {
            System.err.println("Connection is not established.");
            return null;
        }

        try (Statement statement = con.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM emp_info")) {

            while (resultSet.next()) {
                int id_num = resultSet.getInt("id_num");
                String last_name = resultSet.getString("last_name");
                System.out.println(id_num + " " + last_name);
            }
            resultSet1 = resultSet;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultSet1;
    }



    public static void main(String[] args) throws SQLException {
        String databaseUrl = "jdbc:mysql://localhost:3306/employee_web3_new";
        String username = "root";
        String password = "";

        MysqlSample mysqlSample = new MysqlSample(databaseUrl, username, password);
        ResultSet r1 = mysqlSample.fetchAndPrintEmployeeInfo();

        System.out.println("do you want to edit details? just type the ID");
        Scanner input1 = new Scanner(System.in);
        int id_num = input1.nextInt();
        System.out.println("Update last name - type new last name:");
        String last_name = input1.next();
        mysqlSample.updateEmp(id_num, last_name);
        r1 = null;
        r1 = mysqlSample.fetchAndPrintEmployeeInfo();
        mysqlSample.insertRowDB("Yim","Marc","5464654","QC","1999-12-25","Java Programmer");
        r1 = null;
        r1 = mysqlSample.fetchAndPrintEmployeeInfo();
        mysqlSample.closeConnection();
    }

    void updateEmp(int idNum, String lastName) throws SQLException {
        try (Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
             ResultSet resultSet = statement.executeQuery("SELECT * FROM emp_info")) {
            resultSet.absolute(idNum);
            resultSet.updateString("last_name",lastName);
            resultSet.updateRow();
        }

    }

    void insertRowDB(String last_name,String first_name,String mobile_number, String address, String dob,String job_title) throws SQLException {
        try (Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_UPDATABLE);
             ResultSet resultSet = statement.executeQuery("SELECT * FROM emp_info")) {
            resultSet.moveToInsertRow();
            resultSet.updateString("last_name",last_name);
            resultSet.updateString("first_name",first_name);
            resultSet.updateString("mobile_num",mobile_number);
            resultSet.updateString("address",address);
            resultSet.updateString("dob",dob);
            resultSet.updateString("job_title",job_title);
            resultSet.insertRow();
        }
    }


}

