package classsDay13;

public interface INode<K> {
    K getKey();
    void setKey(K key);
    //@Override
   // public int compareTo(Object o);

    INode<K> getNext();
    void setNext(INode<K> next);

}
