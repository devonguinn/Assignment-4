/**
 * Created by Devon Guinn SIU850931983 on 10/14/2015.
 */

//LinkedStack
public class Node<T> {

    public T data;
    public Node next;
    public Node(T data,null){
        this.data=data;
    }

    public void display(){
        Node currentNode = firstNode;
        while(currentNode!=null){
            System.out.print(currentNode.data);
            currentNode=currentNode.next;
        }
    }
}

//ArrayStack

public void display() {
    for (int i = 0; i <= stackArray.length(); i++) {
        System.out.print(stackArray[i]);
    }
}
//VectorStack
public void display(){
    for (int i= 0; i<=vectorStack.size();i++){
        System.out.println(vectorStack[i]);
    }
}
