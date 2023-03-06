import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String group;

    public Student(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", group='" + group + '\'' +
                '}';
    }

    void getAll(ArrayList<Student> students) {
        for (Student st : students) {
            System.out.println(st);
        }
    }

    void filtGroup(ArrayList<Student> students) {
        ArrayList<Student> java = new ArrayList<>();
        ArrayList<Student> js = new ArrayList<>();

        for (Student g : students) {
            if (g.group.contains("JAVA")) {
                java.add(g);

            } else {
                js.add(g);

            }
        }
        js.forEach(System.out::println);
        java.forEach(System.out::println);

    }
    void getAge(ArrayList<Student>students){
        ArrayList <Student> ages= new ArrayList<>();
        for (Student ag:students) {
            if(ag.age==18||ag.age==19||ag.age==20||ag.age==21||ag.age==22||ag.age==23){
                ages.add(ag);
            }
        }
        ages.forEach(System.out::println);
    }
    void  findNAMEA(ArrayList<Student>students){
        ArrayList<Student> al=new ArrayList<>();
        for (Student s:students)
          if(s.name.startsWith("A")){
              al.add(s);

              }
        al.forEach(System.out::println);
          }

        }



