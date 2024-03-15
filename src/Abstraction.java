
// Abstraction
 abstract class Animal{

 abstract void walk();

 public void eat(){
  System.out.println("animal eats");
 }

}
class chicken extends Animal{
 public void walk(){
  System.out.println("walking with 2 legs");
 }

}
class horse extends Animal{

 public void walk(){
  System.out.println("walking with 4 legs ");
 }
}


public class Abstraction {
 public static void main (String[]args){
  horse h1 = new horse();
  h1.walk();
h1.eat();
 }
}
