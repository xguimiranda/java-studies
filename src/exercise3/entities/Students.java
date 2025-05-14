package exercise3.entities;

import java.util.Locale;

public class Students {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;


    public double finalGrade(){
        return grade1+grade2+grade3;
    }
    public String pass(){
        if (finalGrade() >= 60){
            return "Pass";
        }else{
            return "Failed" +
                    " MISSING " + String.format(Locale.US,"%.2f",60-finalGrade()) + " Points";
        }
    }
}

