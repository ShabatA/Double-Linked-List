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
            value = (T) head.getItem();
            numOfItem--;
            if(head == tail){   
                head=tail= null;
            }
            else{
                head = head.getNext();
                head.setPrev(null);
            }
        }
        return value;
    }

    @Override
    public void addToBack(T item) {
        ListNode current = head;
        // we start with one because we don't want the 
        // current to become null before adding
        int cnt = 1;
        while(current!=null && cnt < numOfItem){
            current = current.getNext();
            cnt++;
        }
        
        if (current!=null){
            ListNode newNode = new ListNode(item);
            current.setNext(newNode);
            numOfItem++;
            
        }
        //when the list is empty
        else{
            addToFront(item);
        }
    }

    @Override
    public T removeBack() {
        T value = null;
        if(!isEmpty()){
            ListNode current = head;
            //to make sure the current will point to the node before the last node
            int cnt = 2;
            while(current!=null && cnt <numOfItem)
            {
                current = current.getNext();
                cnt++;
            }
            
            if(current!=null)
            {
                //current is pointing to the node before the last node
                value = (T) current.getNext().getItem();
                current.setNext(null);
            }  
        }
        numOfItem--;
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
        return head==null;
    }

    @Override
    public void clear() {
        head = null;
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
