package jdbc;

import java.sql.*;

public class DemoClass {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/DBPractice01";
        String username = "postgres";
        String password = "12345";
        String query = "SELECT * FROM students";

        try {
            Class.forName("org.postgresql.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("baglanti basarili");//baglanti basarili
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {
                String userData = rs.getString(1) + " : " + rs.getString(2);
                System.out.println(userData);
            }
            st.close();
            connection.close();

            /*
            baglanti basarili
120 : Ali Can
121 : Veli Han
122 : Ayşe Tan
123 : Mary Star
124 : Terry Star
125 : Herry Star
126 : Sally Otar
             */








        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}