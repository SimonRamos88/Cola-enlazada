
package cola.enlazada;

public class ColaEnlazada {
    Node rear;
    Node front;
   
    public boolean empty(){
        return rear == null;
    }
    
    
    public void Encolar(Node element){
        if(!empty()){
            this.rear.setNext(element); //Seteamos a que apunte a este nuevo elemento
            this.rear = element; //Hacemos que ahora la referencia vaya a este nuevo elemento para que ahora sea el nuevo rear
            
        }
        else{
            this.rear = element;
            this.front = element;
        }
    }
    
    public int Desencolar(){
        if(empty()){
            throw new IllegalArgumentException("Esta vacío pa");
        }
        int data = front.getData();
        if(this.rear == this.front){ //Si solo hay un elemento  
            front = null;
            rear = null;           
        }else{
             front = front.getNext();
        }      
        return data;
    }
    
    public ColaEnlazada(){
           this.rear = null;
           this.front = null;
       }
    
    public static void main(String[] args) {
        ColaEnlazada cola = new ColaEnlazada();
        Node n = new Node(1);
        /*
        Node f = n;
        System.out.println("f: "+f.getData());
        System.out.println("n: "+n.getData());
        f.setData(2);
        System.out.println("f: "+f.getData());
        System.out.println("n: "+n.getData());*/
    }
    
}
