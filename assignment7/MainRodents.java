package assignment7;

class Rodent{
    void eat(){
        System.out.println("Rodent is eating");
    }
    void move(){
        System.out.println("Rodent is moving");
    }
    void hide(){
        System.out.println("Rodent is hiding");
    }

}
class Mouse extends Rodent {
    void eat(){
        System.out.println("Mouse is eating");
    }
    void move(){
        System.out.println("Mouse is moving");
    }
    void hide(){
        System.out.println("Mouse is hiding");
    }

}
class Gerbil extends Rodent {
    void eat(){
        System.out.println("Gerbil is eating");
    }
    void move(){
        System.out.println("Gerbil is moving");
    }
    void hide(){
        System.out.println("Gerbil is hiding");
    }

}
class Hamster extends Rodent {
    void eat(){
        System.out.println("Hamster is eating");
    }
    void move(){
        System.out.println("Hamster is moving");
    }
    void hide(){
        System.out.println("Hamster is hiding");
    }
}
public class MainRodents {
    public static void main(String[] args) {
        Rodent[] rodents = { 		//Creation and population of an array
                new Rodent(),
                new Mouse(),
                new Gerbil(),
                new Hamster()
        };
        for(Rodent i : rodents){	//Calling base-class methods
            i.eat();
            i.move();
            i.hide();
        }
    }
}
