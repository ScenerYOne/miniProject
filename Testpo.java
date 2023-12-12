import java.util.ArrayList;
import java.util.Date;

public class Testpo {
    public static void main(String[] args) {
        ArrayList<Student> members = new ArrayList<Student>();

        Date expirationDate1 = new Date(); 
        Date applicationDate1 = new Date(); 
        members.add(new Student("65100021", "AAA", expirationDate1, applicationDate1));

        Date expirationDate2 = new Date(); 
        Date applicationDate2 = new Date();
        members.add(new Student("65100022", "BBB", expirationDate2, applicationDate2));

        Date expirationDate3 = new Date(); 
        Date applicationDate3 = new Date(); 
        members.add(new Student("65100023", "CCC", expirationDate3, applicationDate3));

       
        System.out.println("Input details:");
        for (Student student : members) {
            System.out.println("Student ID: " + student.getStudentID() + " Name: " + student.getStudentName());    
            System.out.println("Expiration Date: " + student.getExpirationDate() +", Application Date: " + student.getApplicationDate());
        }
    }
}