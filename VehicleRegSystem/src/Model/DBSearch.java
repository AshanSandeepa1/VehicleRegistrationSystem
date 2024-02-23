/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.Statement;
/**
 *
 * @author Ashan
 */
public class DBSearch {
    
Statement stmt;
ResultSet rs;

public ResultSet searchLogin(String userEmail) {
 try {
 stmt = DBConnection.getStatementConnection();
 String email = userEmail;
//Execute the Query
rs = stmt.executeQuery("SELECT * FROM login where email='" + email + "'");
 } catch (Exception e) {
 e.printStackTrace();
 }
 return rs;
 }
   
/**
public void addUser(String name, String password) {
    int x = 11;
 try {
stmt = DBConnection.getStatementConnection();
stmt.executeUpdate("INSERT INTO login(username,password) VALUES('"+name+"','"+password+"')");
 } catch (Exception e) {
 e.printStackTrace();
 }
}
**/
}
