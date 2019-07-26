package to_Github;

public class Test {
      public static void main(String[] args) {
    	  Animal a = new Animal();
    	  Dog b = new Dog();
    	  Animal c = new Cat();  //向上转型
    	  Cat d = new Cat();
    	  
    	  a.bark();
    	  b.bark();
    	  c.bark();
    	  d.bark();
    	  }
}
