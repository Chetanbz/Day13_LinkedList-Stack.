package classsDay13;

public class SortedLinkedList {
    public static MyLinkedlist myLinkedlist;

    public static void main(String [] ags) {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyNode<Integer> myForthNode = new MyNode<>(12);
        MyNode<Integer> myFifthNode = new MyNode<>(25);
        MyLinkedlist myLinkedlist = new MyLinkedlist();
        myLinkedlist.add(myFirstNode);
        myLinkedlist.add(mySecondNode);
        myLinkedlist.add(myThirdNode);
        myLinkedlist.add(myForthNode);
        myLinkedlist.add(myFifthNode);
        myLinkedlist.printMyNode();


    }




}
