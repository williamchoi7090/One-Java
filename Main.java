public class Main{
  public static void main(String[] args){
    Leaky<Integer> stack = new Leaky<Integer>(5);
    System.out.println("Is the stack empty? "+ stack.isEmpty());
    System.out.println("Insert 99");
    stack.push(99);
    System.out.println("Is the stack empty? "+ stack.isEmpty());
    System.out.println("Insert 50");
    stack.push(50);
    System.out.println("Insert 25");
    stack.push(25);
    System.out.println("Insert 2");
    stack.push(2);
    System.out.println("Insert 5");
    stack.push(5);
    System.out.println("Current stack:");
    stack.print();
    System.out.println();
    System.out.println("Current top: "+ stack.peek());
    System.out.println("Push 100: ");
    stack.push(100);
    System.out.println("The new stack:");
    stack.print();
    System.out.println();
    System.out.println("The new top of the stack is: "+ stack.peek()); 
  }
}