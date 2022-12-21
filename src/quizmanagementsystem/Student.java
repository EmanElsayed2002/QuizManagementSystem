/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package quizmanagementsystem;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Emoo
 */
public class Student implements Serializable{
    int id  ;
    String name , email, contacts ;
    String date;
    int mark = 0;
    String Gender;
    String thCollege;

    public Student(int id, String name, String email, String contacts, String date, String Gender, String thCollege) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.contacts = contacts;
        this.date = date;
        this.Gender = Gender;
        this.thCollege = thCollege;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContacts() {
        return contacts;
    }

    public void setContacts(String contacts) {
        this.contacts = contacts;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getThCollege() {
        return thCollege;
    }

    public void setThCollege(String thCollege) {
        this.thCollege = thCollege;
    }
   
    
}
