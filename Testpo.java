import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Testpo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date currentDate = calendar.getTime(); // วันที่ปัจจุบัน

        calendar.add(Calendar.DAY_OF_MONTH, 5); // เพิ่ม 5 วัน
        Date futureDate = calendar.getTime(); // วันที่อีก 5 วันข้างหน้า

        ArrayList<Student> member = new ArrayList<Student>();
        member.add(new Student("AN12", "11111", "Jimmy", currentDate, futureDate));
        member.add(new Student("AN13", "11111", "Jimmy1", currentDate, futureDate));
        member.add(new Student("AN11", "11111", "Jimmy2", currentDate, futureDate));
        for (Student x : member) {
            System.out.println(x.toString());
        }
    }
}