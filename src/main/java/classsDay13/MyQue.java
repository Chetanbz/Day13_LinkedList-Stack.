package classsDay13;

public class MyQue {
    public static MyLinkedlist myLinkedList;

    public MyQue() {
        this.myLinkedList = new MyLinkedlist();
    }

    public void enqueue(INode Node) {
        myLinkedList.append(Node);
    }
    public void printQue() {
        myLinkedList.printMyNode();
    }

    public void dequeue() {
        myLinkedList.pop();
    }
    public INode peak() {
        return myLinkedList.head;
    }

}
