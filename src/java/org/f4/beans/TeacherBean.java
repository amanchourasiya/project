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
    private String name,address,moblileno,email;
    private String subjects[]=new String[5];

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public String[] getSubjects() {
        return subjects;
    }
    

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMoblileno() {
        return moblileno;
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
        this.moblileno = moblileno;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
