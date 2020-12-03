package classsDay13;

public class MyLinkedlist {
    public INode head;
    public INode tail;

    public MyLinkedlist() {
        this.head = null;
        this.tail = null;

    }

    public void add(INode  newNode) {
        if(this.tail == null){
            this.tail =newNode;
        }
        if(this.head == null){
            this.head = newNode;
        }else{
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);

        }
    }
    public void append(INode  newNode) {
        if(this.head == null){
            this.head =newNode;
        }
        if(this.tail == null){
            this.tail = newNode;
        }else{
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }
    public void insert(INode prevNode,INode newNode){
        INode tempNode = prevNode.getNext();
        prevNode.setNext(newNode) ;
        newNode.setNext(tempNode);
    }
    public INode pop(){
        INode tempNode = this.head;
        this.head = tempNode.getNext();
        return tempNode;
    }
    public INode popLast(){
        INode tempNode = head;
         while(!(tempNode.getNext() == this.tail)){
             tempNode = tempNode.getNext() ;
         }
         this.tail = tempNode;
         tempNode = tempNode.getNext();
         return  tempNode;
    }

    public void printMyNode(){
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode tempNode = head;
        while(tempNode.getNext() != null){
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
}
