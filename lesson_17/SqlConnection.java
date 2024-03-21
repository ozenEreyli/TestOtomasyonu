package org.rd.ta.sample.lesson_17;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public class SqlConnection {

    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;

        String url = "jdbc:mysql://localhost:3306/TestSql";
        String userName = "root";
        String password = "123456";
        try {
            connection = DriverManager.getConnection(url, userName, password);
            if (connection != null) {
                System.out.println("MySQL veritabanına bağlantı başarılı!");
                String sqlSorgusu = "SELECT * FROM Person";
                preparedStatement = connection.prepareStatement(sqlSorgusu);
                resultSet = preparedStatement.executeQuery();
                while (resultSet.next()) {
                    int id = resultSet.getInt("Id");
                    String name = resultSet.getString("Name");
                    System.out.println("ID: " + id + ", Ad: " + name);
                }
                connection.close();
            }
        } catch (SQLException e) {
            System.out.println("Hata Çıktı: " + e.getMessage());
        }
    }
}
