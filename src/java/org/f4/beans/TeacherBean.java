/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.f4.beans;

/**
 *
 * @author jarvis
 */
public class TeacherBean {
    private String name,address,mobileno,email;
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

  

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMobileno() {
        return mobileno;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMoblileno(String moblileno) {
        this.mobileno = moblileno;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
