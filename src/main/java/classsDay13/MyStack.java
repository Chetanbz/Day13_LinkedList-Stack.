package classsDay13;

public class MyStack{
    public static MyLinkedlist myLinkedList;

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
    public INode pop(){
        return  myLinkedList.pop();
    }
    public void popAll(){
        while(true) {
            if (myLinkedList.head == myLinkedList.tail) {
                myLinkedList.head = null;
                myLinkedList.tail = null;
                break;
            }
            INode popNode = myLinkedList.pop();
        }
    }
}
