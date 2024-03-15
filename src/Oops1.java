class pen {
    String color;
    String type;

    public void write() {
        System.out.println("write something");
        System.out.println(this.color);
        System.out.println(this.type);
    }
}
class Student1{
    String name;
    int age;
    public void printdetail(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
    public class Oops1{
        public static void main(String []args){
           Student1 s1=new Student1();
           s1.name="karan";
           s1.age=19;
           s1.printdetail();

    }
}
