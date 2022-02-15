/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test_project;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PC
 */
public class DBConnection {
     public static void main(String[] args) { 
         try {
             Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/CarDb","root","");
            System.out.println(con);
         } catch (Exception e) {
             e.printStackTrace();
         }
    }
}
