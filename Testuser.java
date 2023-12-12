
import java.util.*;
import java.util.Date;
public class Testuser {
    public static void main(String[] args) {

    Date expirationDate = new Date();
    Date expirationDateUpdate = new Date(expirationDate);

    ArrayList<Student> member = new ArrayList<Student>();
    member.add(new Student("11111","Jimmy",expirationDate,expirationDateUpdate));
    member.add(new Student("11111","Jimmy",expirationDate,expirationDate));
    member.add(new Student("11111","Jimmy",expirationDate,expirationDate));
    for(Student x:member){
       System.out.println( x.toString());
    }

    }
    }
