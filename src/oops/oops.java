//there are methods in java, not functions. but methods are usually termed as function.
package oops;


/* 1. Abstract Class
• An abstract class must be declared with an abstract keyword.
• It can have abstract and non-abstract methods.
• It cannot be instantiated.
• It can have constructors and static methods also.
• It can have final methods which will force the subclass not to change the body of the method. 
*/


abstract class Animal //abstract class is a blueprint for child classes.
{
    public void sound()
    {
        System.out.println("sound of the animal");
    }
    abstract void walk(); // all child classes must have this method
}

class Horse extends Animal
{
    public void walk()
    {
        System.out.println("Horse walks on 4 legs");
    }
}

class Dog extends Animal //inheritence 
{
    public void walk()
    {
        System.out.println("dog is walking");
    }
    //method overriding
    public void sound()
    {
        System.out.println("dog barks...");
    }
    public void countLegs()
    {
        System.out.println("has 4 legs");
    }

    public void eat()//*function overloading
    {
        System.out.println("eating");
    }
    public void eat(String s)//*function overloading
    {
        System.out.println("dog is eating: "+ s );
    }
}

public class oops { //name should be Oops-> good practice, in java, classname stats with uppercase.

    public static void main(String[] args){
        System.out.println("code starts from here...");

        Dog d1 = new Dog();
        d1.sound();

        Horse h1 = new Horse();
        h1.walk();
    }
    
}
