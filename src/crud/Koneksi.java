/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Rony Setiawan
 */
public class Koneksi {
    
    private static Connection koneksi;
    
    public static Connection getConnection() throws SQLException {
        String db = "jdbc:mysql://localhost:3306/javadb_mahasiswa";
        String user = "root";
        String pass = "123";
        if(koneksi == null) {
            koneksi = DriverManager.getConnection(db, user, pass);
        }
        
        return koneksi;
    }
            
    
}
