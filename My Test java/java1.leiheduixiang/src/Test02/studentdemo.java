package Test02;

public class studentdemo {
    public static void main(String[] args) {
        student s = new student();

        s.setName("钟小康");
        s.setAge(18);
        s.show();

        System.out.println(s.getName()+","+s.getAge());
    }
}
