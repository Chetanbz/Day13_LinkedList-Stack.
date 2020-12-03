package classsDay13;

import org.junit.Assert;
import org.junit.Test;

public class MyQueTest {
    @Test
    public void givenNumberShouldAddAtLastNode(){
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);
        MyQue myQue = new MyQue();
        myQue.enqueue(myFirstNode);
        myQue.enqueue(mySecondNode);
        myQue.enqueue(myThirdNode);
        myQue.printQue();

        boolean result = myQue.myLinkedList.head.equals(myFirstNode)  &&
                         myQue.myLinkedList.head.getNext().equals(mySecondNode)&&
                         myQue.myLinkedList.tail.equals(myThirdNode);
        Assert.assertTrue(result);

    }
}
