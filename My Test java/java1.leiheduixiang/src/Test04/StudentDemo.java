package Test04;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("lebron");
        s.setAge(36);
        s.show();
        
        Student s1 = new Student("lebron",36);
        s1.show();
    }
}
