package Test03;

public class StudentDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.shou();

        Student s1 = new Student("钟小康");
        s1.shou();

        Student s2 = new Student(18);
        s2.shou();

        Student s3 = new Student("钟小康",18);
        s3.shou();
    }
}
