// the output will be 24. a gets incremented when the object is initiated because 
// there is an increment command in the constructor
// and one last time in the m1 function


// I've changed Void to void and end line 16 with semicolon to make the program WORK.


public class Myclass {
    static int a = 20;
    Myclass() {
    a++;
    }
    void m1() {
    a++;
    System.out.println(a);
    }
    public static void main(String[]
    args)
    {
    Myclass obj = new Myclass();
    Myclass obj2 = new Myclass();
    Myclass obj3 = new Myclass();
    obj3.m1();
    }
    }
public class A5q4 {
    
}
