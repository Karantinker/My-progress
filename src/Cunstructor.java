
class normal{
    String name;
    int age ;
    public void info(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    normal(String name,int age){

        this.name=name;
        this.age=age;

    }

}

public class Cunstructor {
    public static void main(String[]args){

        normal s1=new normal("karan", 19);
        s1.info();

    }
}
