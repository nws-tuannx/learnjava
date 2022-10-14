public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Student student = new Student();

        student.setAge(22);
        student.setName("Tuân");
        System.out.println("Tên student: " + student.getName() + " tuổi là : "+student.getAge());
        Student student1 = new Student(10,"Vinh");
        student1.display();
    }
}