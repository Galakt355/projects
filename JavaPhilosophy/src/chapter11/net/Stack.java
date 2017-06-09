package net;

import java.util.*;

public class Stack<T>{
    private LinkedList<T> storage = new LinkedList<T>();

    public void push(T val){
        storage.addFirst(val);
    }

    public T peek(){
        return storage.getFirst();
    }

    public T pop(){
        return storage.removeFirst();
    }

    public T remove(){
        return storage.remove();
    }

    public boolean empty(){
        return storage.isEmpty();
    }

    public String toString(){
        return storage.toString();
    }
}