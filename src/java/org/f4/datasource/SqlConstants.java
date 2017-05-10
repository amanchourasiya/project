/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.f4.datasource;

/**
 *
 * @author jarvis
 */
public class SqlConstants {
    public static final String LOGIN_CHECK="select count(*) from LOGIN where USERID=? and PASSWORD=?";
    public static final String STUDENT_REGISTER="insert into NEWSTUDENTREG values (?,?,?,?,?,?)";
    public static final String TEACHER_REGISTER="insert into NEWTEACHERREG values (?,?,?,?,?,?)";
    public static final String PASSWORD_SET="insert into LOGIN values(?,?,?)";
    public static final String SET_STUDENT_COURSE="insert into STUDENTCOURSE VALUES(?,?)";
    public static final String GET_STUDENT_COURSE="SELECT COURSE FROM STUDENTCOURSE WHERE SID=?";
    public static final String CHECK_COURSE_ENROLL="SELECT COUNT(*) FROM STUDENTCOURSE"; 
    public static final String CHECK_ROLE="SELECT ROLE FROM LOGIN WHERE USERID=? AND PASSWORD=?";
}
