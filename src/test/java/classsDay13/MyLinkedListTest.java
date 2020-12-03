package classsDay13;

import org.junit.Assert;
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

}

