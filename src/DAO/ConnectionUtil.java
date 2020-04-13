/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author mrboy
 */
public class ConnectionUtil {
    private static final String hostName="localhost";
    private static final String userName="root";
    private static final String password="123456";
    private static final String dbName="qlks_test";
    private static final String connectionUrl ="jdbc:mysql://:3327/"+dbName;
    
    public static Connection getConnect(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection coon = DriverManager.getConnection(connectionUrl,userName,password);
            System.out.println("Ket noi den dl thanh cong");
            return coon;
        } catch(Exception e){
            System.out.println("Loi ket noi den " +e.getMessage());
            e.printStackTrace();
        }
        return null;
    } 
}
