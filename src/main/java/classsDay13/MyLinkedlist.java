package classsDay13;

public class MyLinkedlist<K> {
    public INode<K> head;
    public INode<K> tail;

    public MyLinkedlist() {
        this.head = null;
        this.tail = null;

    }

    public void add(INode<K>  newNode) {
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
    public void append(INode<K>  newNode) {
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
    public void insert(INode<K> prevNode,INode<K> newNode){
        INode tempNode = prevNode.getNext();
        prevNode.setNext(newNode) ;
        newNode.setNext(tempNode);
    }
    public INode<K> pop(){
        INode<K> tempNode = this.head;
        this.head = tempNode.getNext();
        return tempNode;
    }
    public INode<K> delete(int value){
        INode<K> deleteNode = null;
        INode<K> tempNode = this.head;
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

    public INode<K> popLast(){
        INode<K> tempNode = head;
         while(!(tempNode.getNext() == this.tail)){
             tempNode = tempNode.getNext() ;
         }
         this.tail = tempNode;
         tempNode = tempNode.getNext();
         return  tempNode;
    }
    public INode<K> search(int value){
        INode<K> searchedNode = null;
        INode<K> tempNode = head;
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
        INode<K> tempNode = head;
        while(tempNode.getNext() != null){
            count++;
            tempNode = tempNode.getNext();
        }
        return  count;
    }

    public void printMyNode(){
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode<K> tempNode = head;
        while(tempNode.getNext() != null){
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }
    public INode<K> search(K key) {
        if(head==null)
            return null;

        INode<K> tempNode = this.head;
        while (tempNode != null) {
            if (tempNode.getKey().equals(key))
                return tempNode;
            tempNode =tempNode.getNext();
        }
        return null;
    }

    @Override
    public String toString() {
        return "MyLinkedListNodes{" + head + "}";
    }

    /*    public int compareTo(Object o) {
        INode myNode = (INode) o;
        if ((int)this.key> (int)myNode.getKey()) {
            return -1;
        }
        else if ((int)this.key < (int)myNode.getKey()) {
            return +1;
        }
        else{
            return  0;
        }
    }*/

}
