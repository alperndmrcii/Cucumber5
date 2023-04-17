package _JDBC.Gun01;

import _JDBC.JDBCParent;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_NextPrevAbsRel extends JDBCParent {
    @Test
    public void nextPrev() throws SQLException {
        ResultSet rs= statement.executeQuery("select * from language");

        rs.next(); // ilk satır 1.satır
        System.out.println("1. satir dilAdi="+ rs.getString(2));  // 2 column sırası English
        //  rs.getString(name)

        rs.next(); // 2.satır
        System.out.println("2. satir dilAdi="+ rs.getString(2));  // italian

        rs.next(); // 3.satır
        System.out.println("2. satir dilAdi="+ rs.getString(2)); // Japanese

        rs.previous(); // -> 2.satıra gitti
        System.out.println("1 geri satır dilAdi="+ rs.getString(2));  // italian

    }
    @Test
    public void AbsoluteRelative() throws SQLException {
        ResultSet rs= statement.executeQuery("select * from film");
        //rs.next(); sonraki satır demek
        //rs.previous; önceki satır demek
        // rs.absolute(10); baştan itibaren parantez içindeki sayıya gider.
        // rs. relative(10) kaçıncı yerdeyse o yerden parantez içindeki sayı kadar ileri gider.
        // rs.absolute(-10) sondan 10.satır demek
        //rs.relative(-10) bulunduğu yerden 10 satır geri demek
        rs.absolute(10); //10.satıra git demek

        System.out.println("10.satır = "+rs.getString("title"));
        rs.relative(5); // 15 e gider çünkü bir önceki konumu 10 du

    }
}
