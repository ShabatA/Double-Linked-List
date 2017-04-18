/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Abuobayda.Shabat.DataStructure;

/**
 *
 * @author Abuobyda Shabat
 */
public class ListNode <T> implements NodeInterface <T>{
    
    //Create two fields item and next
    private T item;
    private ListNode next;
    private ListNode prev;
    
    //Constructor for the first and the last node
    //where the next will be null
    ListNode(T value){
        this(value, null,null);
    }
    
    //Constructor for any node that have 
    //item and a reference to the next node
    ListNode(T value, ListNode n, ListNode p){
        item = value;
        next = n;
        prev = p;
    }
    
    @Override
    public void setNext(ListNode n) {
        next = n;
    }

    @Override
    public ListNode getNext() {
        return next;
    }

    @Override
    public void setItem(T item) {
        this.item = (T) item;
    }

    @Override
    public T getItem() {
        return (T) item;
    }
    
    @Override
    public void setPrev(ListNode p) {
        prev = p;
    }

    @Override
    public ListNode getPrev() {
        return prev;
    }
    
    
}
