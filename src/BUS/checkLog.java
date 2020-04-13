/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import java.sql.*;
import javax.swing.*;
import DAO.*;

/**
 *
 * @author mrboy
 */
public class checkLog {

    public static Connection conn = null;
    public static ResultSet rs = null;
    public static PreparedStatement pst = null;

    public static String testConnect() {
        try {
            conn = ConnectionUtil.getConnect();
            return "Kết nối csdl thành công";
        } catch (Exception e) {
            return "Kết nối csdl thất bại";
        }
    }

    public static ResultSet cLog(String username, String password) {
        String sql = "SELECT * FROM `qltk` WHERE username=? and password=?";
        try{
        pst = conn.prepareStatement(sql);
        pst.setString(2, username);
        pst.setString(3, password);
        return pst.executeQuery();
    }catch (Exception e){
        return rs = null;
    }
}
}
