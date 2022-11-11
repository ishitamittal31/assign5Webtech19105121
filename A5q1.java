// MULTIPLE INHERITANCE IS NOT ALLOWED IN JAVA HENCE BLUEWHALE CANNOT BE INHERIT FROM
// MAMMALS AND MARINEANIMALS


 class Mammals{

    void print(){
    System.out.println("I am mammal");
    }

}

 class MarineAnimals{

    void print(){
    System.out.println("I am a marine animal");
    }


}

 class BlueWhale{

    void print(){
    System.out.println("I belong to both the categories: Mammals as well as Marine Animals");
    }

}

public class A5q1 {
    
    public static void main(String args[]){

        Mammals mammalsObject = new Mammals();
        MarineAnimals marineAnimalsObject = new MarineAnimals();
        BlueWhale blueWhaleObject = new BlueWhale();
        mammalsObject.print(); //1
        marineAnimalsObject.print(); //2
        blueWhaleObject.print(); //3

        //4 - WILL NOT BE IMPLEMENTED BECUASE WE CANNOT INHERIT BOTH CLASSES TO
        // BLUEWHALE BECAUSE MULTIPLE INHERITANCE IS NOT ALLOWED IN JAVA
        // SO I HAVE IMPLEMENETED FIRST THREE PARTS WITHOUT ANY INHERITANCE
        //BETWEEN CLASSES
    }

}
