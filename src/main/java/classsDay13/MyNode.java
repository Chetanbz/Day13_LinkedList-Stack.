package classsDay13;

public class MyNode<K> implements INode<K> {
    private K key;
    private INode next;    /// MyNode is entity of same class

    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public INode getNext() {
        return next;
    }

    public void setNext(INode next) {
        this.next = next;
    }

    public int compareTo(Object o) {
        MyNode myNode = (MyNode)o;

        if (this.key == myNode.key) {
            return 0;
        }
        else if((int)this.key > (int)myNode.key) {
            return +1;
        }
        else {
            return -1;
        }
    }



}
