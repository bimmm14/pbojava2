/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_uts;

/**
 *
 * @author devitawahyuni
 */
    import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL = "jdbc:derby://localhost:1527/PARFUMEE";
    private static final String USER = "USER04"; // Ganti sesuai user kamu
    private static final String PASS = "123";      // Kalau tidak pakai password, biarkan kosong

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASS);
    }
}