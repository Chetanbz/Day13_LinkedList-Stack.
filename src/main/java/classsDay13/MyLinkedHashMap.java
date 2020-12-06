package classsDay13;

import java.util.ArrayList;

public class MyLinkedHashMap<K,V> {
    private final int numberBucket;
    ArrayList<MyLinkedlist<K>> myBucketArray;

    public MyLinkedHashMap() {
        this.numberBucket = 10;
        this.myBucketArray = new ArrayList<>(numberBucket);

        for(int i=0 ; i< numberBucket; i++){
            this.myBucketArray.add(null);
        }
    }
    private int getBucketIndex(K key) {
        int hashCode = Math.abs(key.hashCode());
        int index = hashCode % numberBucket;
        //System.out.println("Key:" + key+ "hashcode" +hashCode + "index" + index);
        return index;
    }

    public V get(K key) {
        int index = this.getBucketIndex(key);
        MyLinkedlist<K> myLinkedlist = this.myBucketArray.get(index);
        if(myLinkedlist == null) return null;
        MyMapNode<K,V> myMapNode = (MyMapNode<K,V>) myLinkedlist.search(key);
        return  (myMapNode == null) ? null : myMapNode.getValue();
    }

    public void add(K key, V value) {
        int index = this.getBucketIndex(key);
        MyLinkedlist<K> myLinkedlist = this.myBucketArray.get(index);
        if (myLinkedlist == null){
            myLinkedlist = new MyLinkedlist<>();
            this.myBucketArray.set(index,myLinkedlist);
        }
        MyMapNode<K,V> myMapNode = (MyMapNode<K, V>) myLinkedlist.search(key);
        if(myMapNode == null){
            myMapNode = new MyMapNode<>(key,value);
            myLinkedlist.append(myMapNode);
        }
        else{
            myMapNode.setValue(value);
        }
    }

    @Override
    public String toString(){
        return "MyLinkedHashMap List{" + myBucketArray + '}';
    }
}
