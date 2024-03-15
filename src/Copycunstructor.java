class Student{
    String name;
    int age;
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(Student s2){
        this.name=s2.name;
        this.age =s2.age;
    }
    Student(){

    }


}

public class Copycunstructor {
    public static void main(String[] args){

        Student s1 = new Student();
        s1.name ="radha";
        s1.age =19;
        Student s2 = new Student(s1);
        s2.printinfo();

    }
}
