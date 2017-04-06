/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.f4.datasource;
import java.sql.*;
/**
 *
 * @author shyamli
 */
public class StudentDAO {
    public Connection conn;
    public PreparedStatement ps;
    private final String url="jdbc:oracle:thin@localhost:1521/xe";
    private final String user="fantastic";
    private final String pwd="four";
  public StudentDAO{
    
conn=DriverManager.getConnection(url,user,pwd);
}  
}
