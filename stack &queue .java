//stack push operation
import java.util.*;  
public class stack_push 
{  
public static void main(String[] args)   
{  
Stack<Integer> stk= new Stack<>();  
boolean result = stk.empty();  
System.out.println("Is the stack empty? " + result);  
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
stk.push(n);  
n=sc.nextInt();
stk.push(n);  
n=sc.nextInt();
stk.push(n);  
n=sc.nextInt();
stk.push(n);  
n=sc.nextInt();
stk.push(n);  
System.out.println("Elements in Stack: " + stk);  
result = stk.empty();  
System.out.println("Is the stack empty? " + result);  
}  
}  

//stack pop operation
import java.util.*;  
public class stack_pop 
{  
public static void main(String args[])   
{  
Stack <Integer> stk = new Stack<>();  
System.out.println("stack: " + stk);  
pushelmnt(stk, 20);  
pushelmnt(stk, 13);  
pushelmnt(stk, 89);  
pushelmnt(stk, 90);  
pushelmnt(stk, 11);  
pushelmnt(stk, 45);  
pushelmnt(stk, 18);  
popelmnt(stk);  
popelmnt(stk);  
try   
{  
popelmnt(stk);  
}   
catch (EmptyStackException e)   
{  
System.out.println("empty stack");  
}  
}  
static void pushelmnt(Stack stk, int x)   
{  
stk.push(new Integer(x));  
System.out.println("push -> " + x);  
System.out.println("stack: " + stk);  
}  
static void popelmnt(Stack stk)   
{  
System.out.print("pop -> ");  
Integer x = (Integer) stk.pop();  
System.out.println(x);  
System.out.println("stack: " + stk);  
}  
}  
//stack peek operation 
import java.util.Stack;  
public class stack_peek   
{  
public static void main(String[] args)   
{  
Stack<String> stk= new Stack<>();  
stk.push("Apple");  
stk.push("Grapes");  
stk.push("Mango");  
stk.push("Orange");  
System.out.println("Stack: " + stk);  
String fruits = stk.peek();  
System.out.println("Element at top: " + fruits);  
}  
}  
//queue operation 
import java.util.*;  
class queue{  
public static void main(String args[]){  
PriorityQueue<String> queue=new PriorityQueue<String>();  
queue.add("Amit");  
queue.add("Vijay");  
queue.add("Karan");  
queue.add("Jai");  
queue.add("Rahul");  
System.out.println("head:"+queue.element());  
System.out.println("head:"+queue.peek());  
System.out.println("iterating the queue elements:");  
Iterator itr=queue.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
queue.remove();  
queue.poll();  
System.out.println("after removing two elements:");  
Iterator<String> itr2=queue.iterator();  
while(itr2.hasNext()){  
System.out.println(itr2.next());  
}  
}  
} 
