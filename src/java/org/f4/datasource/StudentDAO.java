
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
    ResultSet rs;
    private final String url="jdbc:oracle:thin@localhost:1521/xe";
    private final String user="fantastic";
    private final String pwd="four";
  public StudentDAO() throws SQLException{
    
conn=DriverManager.getConnection(url,user,pwd);
} 
  public boolean loginCheck(String user,String pwd)throws SQLException{
  
      ps=conn.prepareStatement(SqlConstants.LOGIN_CHECK);
      ps.setString(0, user);
      ps.setString(1,pwd);
      rs=ps.executeQuery();
      boolean flag=false;
      if(rs.next()){
      
          int count=rs.getInt(0);
          if(count==1)flag=true;
      }
      return flag;
      
  }
}
