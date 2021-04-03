package Test03;

public class Student {
    private String name;
    private int age;

    public Student(){
        System.out.println("无参方法构造");
    }

    public Student(String name){
        this.name = name;
    }

    public  Student(int age){
        this.age = age;
    }

    public Student(String name,int age){
        this.name =name;
        this.age = age;
    }


    public void shou(){
        System.out.println(name+","+age);
    }
}
