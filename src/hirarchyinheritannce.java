//hirarchy inheritance
class shapes {
    public void area() {
        System.out.println("display area:");
    }
}
class Triangless extends shape{
    public void area( int l,int h) {

        System.out.println(1 / 2 * l * h);
    }

}
class Circle extends shapes{
    public void area( int r){

        System.out.println((3.14)*r*r);
    }


}

public class hirarchyinheritannce {
}

