/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package spdvi;
import java.time.LocalDate;
/**
 *
 * @author Alumne
 */
public class User {

    private int id;
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private String gender;
    private boolean isAlive;
    
    User(int id, String firstName, String lastName, LocalDate birthDate,String gender, boolean isAlive) {//To change body of generated methods, choose Tools | Templates.
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.isAlive = isAlive;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
        
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
    
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isIsAlive() {
        return isAlive;
    }

    public void setIsAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }
    
    public int age()          
    {
       int age = LocalDate.now().getYear() - birthDate.getYear();
       return age;
    }

    @Override
    public String toString() {
        
        return id + ": " + firstName + " - " + lastName + " - " + birthDate + " - " + age() + " - " + gender + " - " + isAlive + System.lineSeparator();
    }
}
