package Test;

public class studentdemo {
    public static void main(String[] args) {
        student s = new student();
        System.out.println(s);

        System.out.println(s.name+","+s.age);

        s.name = "何曼琪";
        s.age = 18;

        System.out.println(s.name+","+s.age);

        s.study();
        s.dohomework();
    }
}
