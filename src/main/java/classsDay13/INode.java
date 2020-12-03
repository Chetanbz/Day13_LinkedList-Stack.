package classsDay13;

public interface INode<K> extends Comparable{
    K getKey();
    void setKey(K key);
    @Override
    public int compareTo(Object o);

    INode getNext();
    void setNext(INode next);

}
