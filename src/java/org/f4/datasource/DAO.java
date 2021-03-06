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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    private final String url="jdbc:oracle:thin:@localhost:1521/xe";
    private final String user="fantastic";
    private final String pwd="four";
    private final String driver="oracle.jdbc.driver.OracleDriver";
  public DAO() {
  
   
    try{
        Class.forName(driver);
        System.out.println("Class registered");
conn=DriverManager.getConnection(url,user,pwd);
System.out.println("Connection creatted succesfully");
    }catch(SQLException e){
    System.out.println("SQL Exception in DAO constructor");
    }
    catch(ClassNotFoundException e){
    
        System.out.println("Class not registered");
    }
   
} 
    
  public boolean loginCheck(String user,String pwd){ //Checks the login done by user returns true if successfull.
  boolean flag=false;
      try{
          ps=conn.prepareStatement(SqlConstants.LOGIN_CHECK);
      ps.setString(1, user);
      ps.setString(2,pwd);
      rs=ps.executeQuery();
      
      if(rs.next()){
      
          int count=rs.getInt(1);
          if(count==1)flag=true;
      }
      }catch(SQLException e){
    
          System.out.println("SQL ERR"+e);return false;
      }
      return flag;
      
  }
  
  public boolean studentRegister(StudentBean sb )// Function called when any new student registers on portal
  { boolean flag=false;
     try
     { 
         ps=conn.prepareStatement(SqlConstants.STUDENT_REGISTER);
         ps.setString(1, sb.getName());
         ps.setString(2,sb.getRoll());
         ps.setString(4, sb.getAddress());
         ps.setString(6, sb.getEmail());
        
         
         ps.setLong(5,Long.parseLong(sb.getMobileno()));
         System.out.println("Bean value "+sb.getDob());
         ps.setDate(3, this.dateProcess(sb.getDob()));
         ps.execute();
         flag=true;
     }
     catch(ParseException e){
     
         System.out.println("parse exception "+e);
     }
     catch(SQLException e)
     {
         System.out.println("handle Sql Exception "+e);
         return flag;
     }
     return flag;
  }
  
   public boolean teacherRegister(TeacherBean sb )//Function called when new teacher registers on portal
  {  boolean flag=false;
      try
      { 
          ps=conn.prepareStatement(SqlConstants.TEACHER_REGISTER);
          ps.setString(1, sb.getName());
         ps.setString(6,sb.getSubject());
         ps.setString(2, sb.getAddress());
         ps.setString(5, sb.getEmail());
         ps.setDate(3,this.dateProcess(sb.getDob()));
         

         //ps.setInt(4,Integer.parseInt(sb.getMobileno()));
         ps.setLong(4, Long.parseLong(sb.getMobileno()));
        System.out.println("Method teacher regisster executed");
        
         ps.execute();
         System.out.println("Method teacher regisster execute()");
         flag=true;
      }
      catch(ParseException e){
      
          System.out.println("Parse exception "+e);
      }
      catch(SQLException e)
     {
         System.out.println("handle Sql Exception "+e);
         return flag;
     }
     
     return flag; 
  }
   private java.sql.Date dateProcess(String str) throws ParseException{ //Function converts String to java.sql.Date and this to java.sql.Date.
   
      SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
      System.out.println("Date string "+str);
      java.util.Date ud=sdf.parse(str);
      long m=ud.getTime();
      java.sql.Date sd=new java.sql.Date(m);
      return sd;
   }
   public boolean setPassword(String uname,String password,String role){
   
       boolean flag=false;
       try{
       
           ps=conn.prepareStatement(SqlConstants.PASSWORD_SET);
           ps.setString(1, uname);
           ps.setString(2, password);
           ps.setString(3,role);
           ps.execute();
           flag=true;
       }catch(SQLException e){
       
           System.out.println("Sql error during password creation "+e);
       }
       return flag;
   }
   
   public boolean courseEnroll(String uid,String course){//This method enrolls student to a particular course.
   
       boolean flag=false;
       try{
       
          ps=conn.prepareStatement(SqlConstants.SET_STUDENT_COURSE);
          ps.setString(1,uid);
          ps.setString(2, course);
          ps.execute();
          flag=true;
       }
       catch(SQLException e){
       
           System.out.println("Some sql exception occurred in courseEnroll()");
       }
       return flag;
   }
   
   public int checkCourseEnroll(String uid){ //This method checks if user has enrolled for any course.
   
       int returnvalue=0;
       try{
       
           ps=conn.prepareStatement(SqlConstants.CHECK_COURSE_ENROLL);
           ps.setString(1,uid);
           returnvalue=1;
       }
       catch(SQLException e){
       
           System.out.println("Exception in checkCourseEnroll()");
       }
       return returnvalue;
       
   }
   public String checkRole(String user,String pwd){
   
       String role="";
       try{
       
           ps=conn.prepareStatement(SqlConstants.CHECK_ROLE);
           ps.setString(1, user);
           ps.setString(2, pwd);
           ResultSet rs=ps.executeQuery();
           while(rs.next()){
           
               role=rs.getString(1);
           }
       }catch(SQLException e){
       
           System.out.println("SQL error in checkrole()");
       }
       return role;
       
   }
   
   public boolean forgotPassword(String user,String newPwd){
   
       boolean flag=false;
       try{
       
           ps=conn.prepareStatement(SqlConstants.FORGOT_PASSWORD);
           ps.setString(1,newPwd);
           ps.setString(2, user);
           ps.executeQuery();
           flag=true;
       }
       catch(SQLException e){
   
       System.out.println("Exception in forgotPassword()");
    
   }
       return flag;
   }
}
