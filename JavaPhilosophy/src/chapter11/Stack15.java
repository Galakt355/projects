import net.*;

public class Stack15{
    public static void main(String[] args){
        Stack<String> stack = new Stack<>();

        for(String s : "U n c".split(" ")){
            stack.push(s);
        }
        System.out.println(stack);

        System.out.print(stack.peek());
        stack.remove();

        while (!stack.empty()){
            System.out.print(stack.pop());
        }

        for(String s : "e r t".split(" ")){
            stack.push(s);
        }
        while (!stack.empty()){
            System.out.print(stack.pop());
        }
        for(String s : "a".split(" ")){
            stack.push(s);
        }
        while (!stack.empty()){
            System.out.print(stack.pop());
        }
        for(String s : "i".split(" ")){
            stack.push(s);
        }
        while (!stack.empty()){
            System.out.print(stack.pop());
        }
        for(String s : "n t y".split(" ")){
            stack.push(s);
        }
        while (!stack.empty()){
            System.out.print(stack.pop());
        }
        for(String s : ", ,".split(",")){
            stack.push(s);
        }
        while (!stack.empty()){
            System.out.print(stack.pop());
        }
        for(String s : "r u".split(" ")){
            stack.push(s);
        }
        while (!stack.empty()){
            System.out.print(stack.pop());
        }
        for(String s : "l e s".split(" ")){
            stack.push(s);
        }
        while (!stack.empty()){
            System.out.print(stack.pop());
        }
    }
}