//multilevel inheritance

class shape {
    public void area() {
        System.out.println("display area:");
    }
}
    class Triangles extends shape{
        public void area( int l,int h) {

            System.out.println(1 / 2 * l * h);
        }

        }
        class EqualateralTriangle extends Triangles{
            public void area( int l,int h){

                System.out.println(1/2*l*h);


    }


}

public class Multilevelinheritance {
}
