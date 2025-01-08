public class OOP{
    public static void main(String args[]){
      Mustang myHorse = new Mustang();
      //Animal -> Horse -> Mustang ->
    }
}

abstract class Animal{
    String color;

    Animal(){
       System.out.println("Animal constructor called ...");
    }

}
class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called...");
    }
}
class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang constructor called ...");
    }
}

