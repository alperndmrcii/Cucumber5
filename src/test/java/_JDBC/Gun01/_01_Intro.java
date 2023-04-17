package _JDBC.Gun01;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_Intro {
    @Test
    public void test1() throws SQLException {
        String hostUrl = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        String username = "root";
        String password = "'\"-LhCB'.%k[4S]z";

        // connection açılıyor fileinputstream
        Connection connection = DriverManager.getConnection(hostUrl, username, password); // bağlantıya click yaptım
        Statement statement = connection.createStatement(); // sorguları çalıştırmak için sorgu gönderme ortamı
        // sorguyu yazdım ve çalıştırdım.
        ResultSet resultSet = statement.executeQuery("select * from customer");// sorgu çalıştı sonuçları nerede ?
        // ilk satırı mı istiyorsun ? son satırı mı istiyorsun ? 5.satırı mı istiyorsun ?

        resultSet.next(); // sıradaki ( bu durumda ilk satır)
        String firstname = resultSet.getString("first_name");
        String lastname = resultSet.getString("last_name");
        System.out.println("1. satırın müşteri adı ve soyadı = " + firstname + " " + lastname);

        resultSet.next(); // sıradaki ( bu durumda ilk satır)
        firstname = resultSet.getString("first_name");
        lastname = resultSet.getString("last_name");
        System.out.println("2. satırın müşteri adı ve soyadı = " + firstname + " " + lastname);

        connection.close();


    }
}
