class Animal{
    String name;
    public void eat(){
        System.out.println("I can eat and also learn java very nicely everyday");
    }
}
class Dog extends Animal{
    public void display(){
        System.out.println("My name is"+name);
    }
}
class Main{
    public static void main(String[] args){
        Dog labrador=new Dog();
        labrador.name="rohu";
        labrador.display();
        labrador.eat();
    }
}