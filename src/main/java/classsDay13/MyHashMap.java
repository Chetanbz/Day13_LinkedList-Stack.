package classsDay13;

public class MyHashMap<K,V> {
    MyLinkedlist<K> myLinkedlist;

    public MyHashMap() {
        this.myLinkedlist = new MyLinkedlist<>();
    }

    public V get(K key) {
        MyMapNode<K,V> myMapNode = (MyMapNode<K,V>)this.myLinkedlist.search(key);
        return  (myMapNode == null) ? null :myMapNode.getValue();
    }

    public void add(K key, V value) {
        MyMapNode<K,V> myMapNode = (MyMapNode<K, V>) this.myLinkedlist.search(key);
        if (myMapNode == null){
            myMapNode = new MyMapNode<>(key,value);
            this.myLinkedlist.append(myMapNode);
        }
        else{
            myMapNode.setValue(value);
        }
    }

    @Override
    public String toString() {
        return "MyHashMapNodes{" + myLinkedlist + " }";
    }
}
