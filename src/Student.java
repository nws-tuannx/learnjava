public class Student {
    int age;
    String name;

    Student (){

    }

    Student (int age, String name){
       this.age = age;
       this.name = name;
    }

    void display() {
        System.out.println("Tên học sinh là: "+ name + " tuổi là: "+age);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
