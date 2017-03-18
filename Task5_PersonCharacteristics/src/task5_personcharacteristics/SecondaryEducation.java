/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task5_personcharacteristics;

import java.time.LocalDate;

public class SecondaryEducation {
    private float finalGrade;
    private boolean graduated;
    private LocalDate enrollmentDate;
    private LocalDate graduationDate;
    private String institutionName;
    
    public SecondaryEducation(String institutionName, LocalDate enrollmentDate, LocalDate graduationDate) {
        this.institutionName = institutionName;
        this.enrollmentDate = enrollmentDate;
        this.graduationDate = graduationDate;
    }
    
    public LocalDate getEnrollmentDate(){
        return enrollmentDate;
    }
    
    public LocalDate getGraduationDate(){
        return graduationDate;
    }
    
    public String getInstitutionName(){
        return institutionName;
    }
    
    public void gotGraduated(float finalGrade){
        this.finalGrade = finalGrade;
        this.graduated = true;
    }
    
    public float getFinalGrade(){
        if(graduated){
            return finalGrade;
        }
        
        return -1;
    }
    
    public boolean isGraduated(){
        return graduated;
    }
    
}
