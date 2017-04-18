/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Abuobayda.Shabat.DataStructure;

/**
 *
 * @author Abuobayda Shabat
 */
public interface NodeInterface<T> {
    //Change the next node reference
    public void setNext(ListNode n);
    //return a reference of the next node
    public ListNode getNext();
    //change the value on anode
    public void setItem(T item);
    //return the item from a particular node
    public T getItem();
    
    
}
