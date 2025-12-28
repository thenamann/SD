package Interf;
/*
**Interfaces:
1• All the fields in interfaces are public, static and final by default.
2• All methods are public & abstract by default.
3• A class that implements an interface must implement all the methods declared in the interface.
4• Interfaces support the functionality of multiple inheritance.
 */
interface Animal {
    void walk(); 
    void eat();
}

class Horse implements Animal {
    public void walk() {
        System.out.println("walks on 4 legs");
    }

    public void eat() {
        System.out.println("eats chanaa");
    }
}

public class Interf
{
    public static void main(String[] args)
    {
        System.out.println("learning interfaces");

        Horse h1 = new Horse();
        h1.eat();
        
    }
}