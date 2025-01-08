public class inheritance{
    public static void main(String args[]){
    Fish Tuna = new Fish();
    Tuna.swim();
    Mammal man = new Mammal();
    man.walk(); 
    Bird eagle = new Bird();
    eagle.eat();


    }
}
// base classs
class Animal{
    void eat(){
        System.out.println("eat feature");
    }
    void breath(){
        System.out.println("breathes feature");
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("walks");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("Swims");
    }
}

class Bird extends Animal{
    void Fly(){
        System.out.println("flys");
    }
}

//deriverd class
// class Fish extends Animal{
//     void swim(){
//         System.out.println("hey i am swiming... ");
//     }
// }
