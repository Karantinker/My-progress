//compile time polymorphism
class Stud{
    String name ;
    int age ;
    public void printinfo(String name){
        System.out.println(name);

    }
    public void printinfo(String name,int age){
        System.out.println(name +" "+age);
    }

}

public class polymorphism {
public static void main(String[]args){

    Stud s1 = new Stud();
    s1.name="karan tinker";
    s1.age=19;
    s1.printinfo(s1.name,s1.age);
}

}
