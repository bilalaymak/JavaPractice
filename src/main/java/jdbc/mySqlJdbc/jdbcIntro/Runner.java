package jdbc.mySqlJdbc.jdbcIntro;

import java.sql.*;
import java.util.ArrayList;


public class Runner {


    public static void main(String[] args) throws SQLException {
        DbHelper dbHelper = new DbHelper();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet;

        try {
            connection = dbHelper.getConnection();
            if (connection == null) {
                System.out.println("connection failed");
            } else {
                System.out.println("connection success");
            }
            String sq1 = "delete from workers where id = ?;";
            statement = connection.prepareStatement(sq1);
            statement.setInt(1, 128);

            int resultOfUpdate = statement.executeUpdate();
            System.out.println("data is deleted : " + resultOfUpdate);



        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }


        /*
        connection success
Number of workers: 7
Workers{id='120', name='Ali Can', address='Ankara', exam_grade='70', registration_date='2023-02-11'}
Workers{id='121', name='Veli Han', address='Trabzon', exam_grade='75', registration_date='2023-03-14'}
Workers{id='122', name='Ayşe Tan', address='Bursa', exam_grade='85', registration_date='2023-02-27'}
Workers{id='123', name='Mary Star', address='İstanbul', exam_grade='95', registration_date='2023-09-12'}
Workers{id='124', name='Terry Star', address='Ankara', exam_grade='95', registration_date='2023-01-30'}
Workers{id='125', name='Herry Star', address='Antalya', exam_grade='95', registration_date='2023-07-24'}
Workers{id='126', name='Sally Otar', address='İzmir', exam_grade='100', registration_date='2023-12-19'}
         */

    public static void selectData() throws SQLException {
        DbHelper dbHelper = new DbHelper();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet;

        try {
            connection = dbHelper.getConnection();
            if (connection == null) {
                System.out.println("connection failed");
            } else {
                System.out.println("connection success");
            }

            statement = connection.createStatement();
            resultSet = statement.executeQuery("select * from practice.workers");
            ArrayList<Workers> workers = new ArrayList<>();

            while (resultSet.next()) {
                workers.add(new Workers(
                        resultSet.getString(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5)));
            }
            System.out.println("Number of workers: " + workers.size());
            //write the result as a list showing its values
            for (Workers worker : workers) {
                System.out.println(worker.toString());
            }

        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            connection.close();
        }

    }
    public static void insertData() throws SQLException {
        DbHelper dbHelper = new DbHelper();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet;

        try {
            connection = dbHelper.getConnection();
            if (connection == null) {
                System.out.println("connection failed");
            } else {
                System.out.println("connection success");
            }
            String sq1 = "INSERT INTO practice.workers (id,name,address,exam_grade,registration_date) VALUES(?,?,?,?,?);";
            statement = connection.prepareStatement(sq1);
            statement.setInt(1,128);
            statement.setString(2,"Suleyman Demirel");
            statement.setString(3,"Ankara");
            statement.setInt(4,99);
            statement.setString(5,"2023-01-01");

            int resultOfUpdate = statement.executeUpdate();
            System.out.println("data is added : " + resultOfUpdate);



        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }
    public static void updateData() throws SQLException {
        DbHelper dbHelper = new DbHelper();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet;

        try {
            connection = dbHelper.getConnection();
            if (connection == null) {
                System.out.println("connection failed");
            } else {
                System.out.println("connection success");
            }
            String sq1 = "update practice.workers set exam_grade = 80,address = 'Bingol' where id = ?;";
            statement = connection.prepareStatement(sq1);
            statement.setInt(1, 127);

            int resultOfUpdate = statement.executeUpdate();
            System.out.println("data is updated : " + resultOfUpdate);



        } catch (SQLException exception) {
            dbHelper.showErrorMessage(exception);
        } finally {
            statement.close();
            connection.close();
        }
    }

}

