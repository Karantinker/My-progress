
//ek generation se dusri generation me jana
class Shape{
    String color;
}
class Triangle extends Shape{

    public void printcolor(){
        System.out.println(color);
    }

}


public class inheritance {

    public static void main(String []args){

        Triangle t1 = new Triangle();
        t1.color="green";
        t1.printcolor();

    }

}
