package classsDay13;

public class MyStack{
    private final MyLinkedlist myLinkedList;

    public MyStack() {
        this.myLinkedList = new MyLinkedlist();
    }

    public void push(INode myNode) {
            myLinkedList.add(myNode);
    }

    public void printStack() {
        myLinkedList.printMyNode();
    }

    public INode peak() {
        return myLinkedList.head;
    }
}
