<<<<<<< HEAD
=======

>>>>>>> be4acb0274953cb1ec527938949e6f02596eee1e
import java.util.*;
public class Testuser {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime(); // วันที่ปัจจุบัน

<<<<<<< HEAD
        calendar.add(Calendar.DAY_OF_MONTH, 5); // เพิ่ม 5 วัน
        Date futureDate = calendar.getTime(); // วันที่อีก 5 วันข้างหน้า
=======
    Date expirationDate = new Date();


    ArrayList<Student> member = new ArrayList<Student>();
    member.add(new Student("00000","11111","Jimmy"));
    member.add(new Student("00000","11111","Jimmy"));
    member.add(new Student("00000","11111","Jimmy"));
    for(Student x:member){
       System.out.println( x.toString());
    }
>>>>>>> be4acb0274953cb1ec527938949e6f02596eee1e

        ArrayList<Student> member = new ArrayList<Student>();
        member.add(new Student("AN12", "11111", "Jimmy", currentDate, futureDate));
        member.add(new Student("AN13", "11111", "Jimmy", currentDate, futureDate));
        member.add(new Student("AN11", "11111", "Jimmy", currentDate, futureDate));
        for (Student x : member) {
            System.out.println(x.toString());
        }
    }
<<<<<<< HEAD
}

=======
    }
>>>>>>> be4acb0274953cb1ec527938949e6f02596eee1e
