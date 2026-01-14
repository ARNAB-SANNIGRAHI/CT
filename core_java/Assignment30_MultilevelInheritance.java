package core_java;


	class Animal1 {
	    void eat() {
	        System.out.println("Animal is eating");
	    }
	}

	class Mammal extends Animal1 {
	    void walk() {
	        System.out.println("Mammal is walking");
	    }
	}

	class Dog extends Mammal {
	    void bark() {
	        System.out.println("Dog is barking");
	    }
	}

	public class Assignment30_MultilevelInheritance {
	    public static void main(String[] args) {
	        Dog d = new Dog();
	        d.eat();
	        d.walk();
	        d.bark();
	    }
	}


