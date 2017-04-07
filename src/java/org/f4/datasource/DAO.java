/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.f4.datasource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.f4.beans.StudentBean;
import org.f4.beans.TeacherBean;

/**
 *
 * @author jarvis
 */
public class DAO {
     public Connection conn;
    public PreparedStatement ps;
    ResultSet rs;
    private final String url="jdbc:oracle:thin@localhost:1521/xe";
    private final String user="fantastic";
    private final String pwd="four";
  public DAO() {
    try{
conn=DriverManager.getConnection(url,user,pwd);
    }catch(SQLException e){
    System.out.println("SQL Exception in DAO constructor");
    }
} 
  public boolean loginCheck(String user,String pwd){
  boolean flag=false;
      try{
          ps=conn.prepareStatement(SqlConstants.LOGIN_CHECK);
      ps.setString(0, user);
      ps.setString(1,pwd);
      rs=ps.executeQuery();
      
      if(rs.next()){
      
          int count=rs.getInt(0);
          if(count==1)flag=true;
      }
      }catch(SQLException e){
    
          System.out.println("SQL ERR");return false;
      }
      return flag;
      
  }
  public boolean studentRegister(StudentBean sb )
  { boolean flag=false;
     try
     { 
         ps=conn.prepareStatement(SqlConstants.STUDENT_REGISTER);
         ps.setString(0, sb.getName());
         ps.setString(1,sb.getRoll());
         ps.setString(3, sb.getAddress());
         ps.setString(5, sb.getEmail());
         ps.setInt(4,Integer.parseInt(sb.getMobileno()));
         ps.execute();
         flag=true;
     }
     catch(SQLException e)
     {
         System.out.println("handle Sql Exception");
         return flag;
     }
     return flag;
  }
   public boolean teacherRegister(TeacherBean sb )
  {
      try
      {
          ps=conn.prepareStatement(SqlConstants.TEACHER_REGISTER);
      }
      catch(SQLException e)
     {
         System.out.println("handle Sql Exception");
         return flag;
     }
     return flag; 
  }
}
