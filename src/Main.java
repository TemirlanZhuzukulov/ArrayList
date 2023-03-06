import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

          Student student = new Student();
        ArrayList<Student >students=new ArrayList<>();
        students.add(new Student("Asan",20,"JS"));
        students.add(new Student("USON",22,"JAVA"));
        students.add(new Student("AKTAN",23,"JS"));
        students.add(new Student("AIBEK",24,"JAVA"));
        students.add(new Student("AMIR",20,"JS"));
        students.add(new Student("MADINA",13,"JAVA"));
        students.add(new Student("SANIRA",27,"JS"));
        students.add(new Student("ULAN",19,"JAVA"));
        students.add(new Student("SANJAR",40,"JS"));
        students.add(new Student("AMINA",15,"JS"));


          student.getAll(students);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
          student.filtGroup(students);
        System.out.println("~~~~~~~~~~~~~~~");
        student.getAge(students);
        System.out.println("~~~~~~~~~~~");
        student.findNAMEA(students);



    }
}