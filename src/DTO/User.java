/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.sql.*;
import javax.swing.*;
import DAO.*;

/**
 *
 * @author mrboy
 */
public class User {
    private int MaTK;
    private String username;
    private String password;
    private String HovaTen;
    private String Quyen;
    private int Trangthai;

    public User(int MaTK, String username, String password, String HovaTen, String Quyen, int Trangthai) {
        this.MaTK = MaTK;
        this.username = username;
        this.password = password;
        this.HovaTen = HovaTen;
        this.Quyen = Quyen;
        this.Trangthai = Trangthai;
    }

    public int getMaTK() {
        return MaTK;
    }

    public void setMaTK(int MaTK) {
        this.MaTK = MaTK;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHovaTen() {
        return HovaTen;
    }

    public void setHovaTen(String HovaTen) {
        this.HovaTen = HovaTen;
    }

    public String getQuyen() {
        return Quyen;
    }

    public void setQuyen(String Quyen) {
        this.Quyen = Quyen;
    }

    public int getTrangthai() {
        return Trangthai;
    }

    public void setTrangthai(int Trangthai) {
        this.Trangthai = Trangthai;
    }
    

}