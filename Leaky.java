import java.util.*;

public class Leaky<A> implements Stack<A>{
  protected A[] stack;
  protected int top, size;
  public Leaky(int b){
    size = b;
    stack = (A[])new Object[size];
    top = -1;
  }
  @Override
  public boolean isEmpty(){
    return top == -1;
  }
  @Override
  public A peek(){
    if( isEmpty() )
    throw new NoSuchElementException("The stack is empty.");
    return stack[top];
  }
  @Override
  public void push(A i){
    if(top + 1 >= size){
      for(int j =0; j< size-1; j++){
        stack[j] = stack [ j+ 1];
      }
      stack[top] = i;
    }
    else if(top + 1 < size ){
      stack[++top] = i;
    }
  }
  @Override
  public A pop(){
    if( isEmpty() )
    throw new NoSuchElementException("The stack is empty.");
    return stack[top--];
  }
  @Override
  public void print(){
    if (isEmpty()){
      System.out.print("The stack is empty");
      return ;
    }
    System.out.print("[");
    for (int i = top; i >= 0; i--)
    System.out.print(stack[i]+" ");
    System.out.print("]");
  }   
}