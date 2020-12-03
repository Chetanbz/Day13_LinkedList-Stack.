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
    public INode delete(int value){
        INode deleteNode = null;
        INode tempNode = this.head;
        if(head.getKey().equals(value)) {
            deleteNode = pop();
        }
        else if(tail.getKey().equals(value)){
            deleteNode = popLast();
        }
        else {
            while (!(tempNode.getNext() == null)) {
                tempNode = tempNode.getNext();
                if (tempNode.getNext().getKey().equals(value)) {
                    deleteNode = tempNode.getNext();
                    tempNode.setNext(tempNode.getNext().getNext());
                }
                tempNode = tempNode.getNext() ;
            }
        }
        return  deleteNode;
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
    public INode search(int value){
        INode searchedNode = null;
        INode tempNode = head;
        if(this.tail.getKey().equals(value)) {
            searchedNode = tail;
            return searchedNode;
        }
        while(!(tempNode == this.tail)){
            if (tempNode.getKey().equals(value)) {
                searchedNode = tempNode;
                break;
            }
            tempNode = tempNode.getNext() ;
        }
        return searchedNode;
    }
    public int size(){
        int count = 1;
        INode tempNode = head;
        while(tempNode.getNext() != null){
            count++;
            tempNode = tempNode.getNext();
        }
        return  count;
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
