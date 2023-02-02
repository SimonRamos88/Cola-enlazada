
package cola.enlazada;


public class Node {
    int data;
    Node next;
    
    public int getData(){
        return this.data;
    }
    
    public void setData(int Data){
        this.data = Data;
    }
    
    public Node getNext(){
        return this.next;
    }
    
    public void setNext(Node n){
        this.next = n;
    }
    
    public Node(){
        this(0);
    }
    public Node(int Data){
        this.data = Data;
        this.next = null;
    }
    
}
