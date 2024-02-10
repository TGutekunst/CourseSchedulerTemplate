/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author Thomm
 */
public class StudentEntry {
    private String studentID;
    private String firstName;
    private String lastName;
    
    public StudentEntry(String studentID, String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
    }
    
    public String getFirstName() {
        return this.firstName;
    }
    
    public String getLastName() {
        return this.lastName;
    }
    
    public String getStudentID() {
        return this.studentID;
    }
    
}
