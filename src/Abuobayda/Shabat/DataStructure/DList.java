/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Abuobayda.Shabat.DataStructure;

/**
 *
 * @author Abuobyda Shabat
 */
public class DList<T> implements DListInterface<T> {
    //pointer to the first node
    ListNode head;
    //pointer to the last node
    ListNode tail;
    //the num of items in the list
    int numOfItem;
    
    DList(){
        head = null;
        tail=null;
        numOfItem = 0;
    }

    @Override
    public void addToFront(T item) {
        if(!isEmpty())
        {
            ListNode temp = new ListNode(item, head, null);
            head.setPrev(temp);
            head = temp;
        }
        else{
            head= new ListNode(item, null,null);
            tail =head;
        }
        numOfItem++;
    }

    @Override
    public T removeFront() {
        T value = null;
        if(!isEmpty())
        {
            if(head == tail){ 
                value = (T) head.getItem();  
                head=tail= null;
            }
            else{
                value = (T) head.getItem();
                head = head.getNext();
                head.setPrev(null);
            }
            numOfItem--;
        }
        return value;
    }

    @Override
    public void addToBack(T item) {
        if(!isEmpty()){
            ListNode temp = new ListNode(item, null, tail);
            tail.setNext(temp);
            tail =temp;
            numOfItem++;
            
        }else{
            addToFront(item);
        }


    }

    @Override
    public T removeBack() {
        T value = null;
        if(!isEmpty()){
            if(head==tail){
                value = (T) head.getItem();  
                head=tail= null;
                numOfItem--;
            }
            else{
                value = (T) tail.getItem();
                tail = tail.getPrev();
                tail.setNext(null);
                numOfItem--;
            }
             
        }
        return value;
    }
    
    //return a reference for the target node

    @Override
    public ListNode contain(T target) {
        ListNode temp = null;
        ListNode current = head;
        while (current!=null){
            if(current.getItem().equals(target))
            {
                temp = current;
            }
            current = current.getNext();
           
        }
        return temp;
    }

    @Override
    public boolean isEmpty() {
        return (head==null&&tail==null);
    }

    @Override
    public void clear() {
        head = tail = null;
        numOfItem=0;
    }

    @Override
    public void display() {
        ListNode current = head;
        while(current!=null){
            System.out.println(current.getItem());
            current = current.getNext();
        }
    }

    @Override
    public int numOfItems() {
        return numOfItem;
    }
    
}
