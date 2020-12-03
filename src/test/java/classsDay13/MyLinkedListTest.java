package classsDay13;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyLinkedListTest {


    @Test
    public void given3NumberAddedToLinkedListShouldNeAddedToTop() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedlist myLinkedlist = new MyLinkedlist();  // linkedList is made
        myLinkedlist.add(myFirstNode);
        myLinkedlist.add(mySecondNode);
        myLinkedlist.add(myThirdNode);
        myLinkedlist.printMyNode();
        boolean result = myLinkedlist.head.equals(myThirdNode)  &&
                myLinkedlist.head.getNext().equals(mySecondNode)&&
                myLinkedlist.tail.equals(myFirstNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3NumberAddedToLinkedListShouldNeAppendNextNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedlist myLinkedlist = new MyLinkedlist();  // linkedList is made
        myLinkedlist.append(myFirstNode);
        myLinkedlist.append(mySecondNode);
        myLinkedlist.append(myThirdNode);
        myLinkedlist.printMyNode();
        boolean result = myLinkedlist.head.equals(myFirstNode)  &&
                myLinkedlist.head.getNext().equals(mySecondNode)&&
                myLinkedlist.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }

    @Test
    public void given3NumberAddedToLinkedListShouldInsertNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedlist myLinkedlist = new MyLinkedlist();  // linkedList is made
        myLinkedlist.append(myFirstNode);
        myLinkedlist.append(myThirdNode);
        myLinkedlist.insert(myFirstNode,mySecondNode);
        myLinkedlist.printMyNode();
        boolean result = myLinkedlist.head.equals(myFirstNode)  &&
                myLinkedlist.head.getNext().equals(mySecondNode)&&
                myLinkedlist.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3NumberAddedToLinkedListShouldFirstNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedlist myLinkedlist = new MyLinkedlist();  // linkedList is made
        myLinkedlist.append(myFirstNode);
        myLinkedlist.append(mySecondNode);
        myLinkedlist.append(myThirdNode);
        INode deleteFirstNode = myLinkedlist.pop();
        myLinkedlist.printMyNode();
        boolean result = myLinkedlist.head.equals(mySecondNode)  &&
                myLinkedlist.head.getNext().equals(myThirdNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3NumberAddedToLinkedListShouldDeleteLNode() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedlist myLinkedlist = new MyLinkedlist();  // linkedList is made
        myLinkedlist.append(myFirstNode);
        myLinkedlist.append(mySecondNode);
        myLinkedlist.append(myThirdNode);
        INode deleteLasNode = myLinkedlist.popLast();
        myLinkedlist.printMyNode();
        boolean result = myLinkedlist.head.equals(myFirstNode)  &&
                myLinkedlist.head.getNext().equals(mySecondNode)&&
                myLinkedlist.tail.equals(mySecondNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3NumberAddedToLinkedListSearchElement() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedlist myLinkedlist = new MyLinkedlist();  // linkedList is made
        myLinkedlist.append(myFirstNode);
        myLinkedlist.append(mySecondNode);
        myLinkedlist.append(myThirdNode);
        INode searchedNode =  myLinkedlist.search(70);
        myLinkedlist.printMyNode();
        boolean result = searchedNode.equals(myThirdNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given3NumberAddedToLinkedListSearchFails() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyLinkedlist myLinkedlist = new MyLinkedlist();  // linkedList is made
        myLinkedlist.append(myFirstNode);
        myLinkedlist.append(mySecondNode);
        myLinkedlist.append(myThirdNode);
        INode searchedNode =  myLinkedlist.search(90);
        myLinkedlist.printMyNode();
        boolean result = searchedNode == null;
        Assert.assertTrue(result);
    }
    @Test
    public void given3NumberAddedToLinkedListSearchAndInsert() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyNode<Integer> myInsertedNode = new MyNode<>(40);
        MyLinkedlist myLinkedlist = new MyLinkedlist();  // linkedList is made
        myLinkedlist.append(myFirstNode);
        myLinkedlist.append(mySecondNode);
        myLinkedlist.append(myThirdNode);
        INode searchedNode =  myLinkedlist.search(30);
        myLinkedlist.insert(searchedNode,myInsertedNode);
        myLinkedlist.printMyNode();
        boolean result = myLinkedlist.head.equals(myFirstNode)  &&
                myLinkedlist.head.getNext().equals(mySecondNode)&&
                myLinkedlist.head.getNext().getNext().equals(myInsertedNode)&&
                myLinkedlist.head.getNext().getNext().getNext().equals(myThirdNode)&&
                myLinkedlist.tail.equals(myThirdNode);
        Assert.assertTrue(result);
    }
    @Test
    public void given4NumberDeleteOneAndShowSize() {
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(40);
        MyNode<Integer> myFourdNode = new MyNode<>(70);
        MyLinkedlist myLinkedlist = new MyLinkedlist();  // linkedList is made
        myLinkedlist.append(myFirstNode);
        myLinkedlist.append(mySecondNode);
        myLinkedlist.append(myThirdNode);
        myLinkedlist.append(myFourdNode);
        INode deleteNode = myLinkedlist.delete(40);
        myLinkedlist.printMyNode();
        int size = myLinkedlist.size();
        boolean result = myLinkedlist.head.equals(myFirstNode)  &&
                myLinkedlist.head.getNext().equals(mySecondNode)&&
                myLinkedlist.head.getNext().getNext().equals(myFourdNode) && size==3;
        Assert.assertTrue(result);
    }
    @Test
    public void given3NumberAddedToLinkedListSSort() {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyLinkedlist myLinkedlist = new MyLinkedlist();  // linkedList is made
        myLinkedlist.add(myFirstNode);
        myLinkedlist.add(mySecondNode);
        myLinkedlist.add(myThirdNode);
        myLinkedlist.printMyNode();

    }


}

