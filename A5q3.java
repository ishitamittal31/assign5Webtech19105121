import java.sql.SQLOutput;
import java.util.Scanner;

class Marks{ //marks class
    static int rollNo = 0;
    String name;
    static float total_marks;
    static float class_total;
    Marks(String name){//constructor that takes in name
       this.name = name;
       Marks.rollNo +=1;
    }
    static void total_marks(){
        class_total += total_marks;//total marks made static
        System.out.println("Total Marks scored are  : " + total_marks);
        total_marks = 0;
    }
    static float average_total_marks(){
        return class_total;
    }

}
class Physics extends Marks{//marks is parent class
    float marks;
    Physics(String name,float marks){//constructor that takes name and marks
        super(name);
        this.marks = marks;
        total_marks += marks;
    }
    void display_marks(){//display function
        System.out.println("Marks in Physics : " + marks);
    }
}

class Mathematics extends Marks{//inherits marks class as well
    float marks;
    Mathematics(String name,float marks){//constructor that takes name and marks
        super(name);
        this.marks = marks;
        super.total_marks += marks;
    }
    void display_marks(){
        System.out.println("Marks in Mathematics : " + marks);//display function
    }
}

class Chemistry extends Marks{//inherits marks class as well
    float marks;
    Chemistry(String name, float marks){//constructor that takes name and marks
        super(name);
        this.marks = marks;
        super.total_marks += marks;
    }
    void display_marks(){//display function
        System.out.println("Marks in Chemistry : " + marks);
    }

}


public class A5q3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = n;
        while(i>0){
            System.out.println("Name:");
            String name = sc.next();
            System.out.println("Roll no " + n);
            System.out.println("marks in Physics : ");
            float phy = sc.nextFloat();//taking input of all three subjects
            System.out.println("marks in Maths : ");
            float math = sc.nextFloat();
            System.out.println("marks in chemistry : ");
            float chem = sc.nextFloat();
            new Physics(name,phy);
            new Mathematics(name,math);
            Chemistry c = new Chemistry(name,chem);
            Marks.total_marks();
            i--;
        }
        float marks = Marks.average_total_marks();
        System.out.println("Average marks of the class are : "+ (marks/n));//taking average by dividing by total number
    }

}
