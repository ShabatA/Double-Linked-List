/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Abuobayda.Shabat.DataStructure;

/**
 *
 * @author Abuobayda Shabat
 */
public interface SListInterface<T> {
    public void addToFront(T item);
    public T removeFront();
    public void addToBack(T item);
    public T removeBack();
    public ListNode contain(T target);
    public boolean isEmpty();
    public void clear();
    public void display();
    public int numOfItems();
    
}
