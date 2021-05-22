package linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinkedListTest {
    @Test
    public void GivenThreeNumbersWhenAddedToLinkedListShouldAddedtoTop() {
        Node<Integer> myFirstNode = new Node<>(70);
        Node<Integer> mySecondNode = new Node<>(30);
        Node<Integer> myThirdNode = new Node<>(56);
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        myLinkedList.addFirst(myFirstNode);
        myLinkedList.addFirst(mySecondNode);
        myLinkedList.addFirst(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = (myLinkedList.head.equals(myThirdNode) && myLinkedList.head.getNext().equals(mySecondNode)
                && myLinkedList.tail.equals(myFirstNode));
        Assertions.assertEquals(true, result);
    }
    /* Created Simple Linked List and Added to the Last Position */
    @Test
    public void GivenThreeNumbersWhenAddedToLinkedListShouldAddedtoBottom() {
        Node<Integer> myFirstNode = new Node<>(56);
        Node<Integer> mySecondNode = new Node<>(30);
        Node<Integer> myThirdNode = new Node<>(70);
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();
        boolean result = (myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
                && myLinkedList.tail.equals(myThirdNode));
        Assertions.assertEquals(true, result);
    }
    /* Insert a Node in Between the Nodes */
    @Test
    public void GivenANodeInsertedInBetweenResultingNodesReturnTrue() {
        Node<Integer> myFirstNode = new Node<>(56);
        Node<Integer> mySecondNode = new Node<>(30);
        Node<Integer> myThirdNode = new Node<>(70);
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.insertNode(myFirstNode, mySecondNode);
        myLinkedList.printMyNodes();
        boolean result = (myLinkedList.head.equals(myFirstNode) && myLinkedList.head.getNext().equals(mySecondNode)
                && myLinkedList.tail.equals(myThirdNode));
        Assertions.assertEquals(true, result);

    }
    /* Remove First Node */
    @Test
    public void PopNodeFromFrontShouldReturnTrue() {
        Node<Integer> myFirstNode = new Node<>(56);
        Node<Integer> mySecondNode = new Node<>(30);
        Node<Integer> myThirdNode = new Node<>(70);
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        myLinkedList.append(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.pop();
        myLinkedList.printMyNodes();
        boolean result = (myLinkedList.head.equals(mySecondNode) && myLinkedList.tail.equals(myThirdNode));
        Assertions.assertEquals(true, result);
    }
    /* Remove Last Node */
    @Test
    public void PopNodeFromLastShouldReturnTrue() {
        Node<Integer> myFirstNode = new Node<>(56);
        Node<Integer> mySecondNode = new Node<>(30);
        Node<Integer> myThirdNode = new Node<>(70);
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.addFirst(myFirstNode);
        myLinkedList.append(mySecondNode);
        myLinkedList.append(myThirdNode);
        myLinkedList.printMyNodes();
        myLinkedList.popLast();
        myLinkedList.printMyNodes();
        boolean result = myLinkedList.head.equals(myFirstNode) && myLinkedList.tail.equals(mySecondNode);
        Assertions.assertTrue(result);
    }
    /* Search Node with given data */
    @Test
    public void SearchNodeForGivenDataIfFoundShouldReturnTrue() {
        Node<Integer> myFirstNode = new Node<>(70);
        Node<Integer> mySecondNode = new Node<>(30);
        Node<Integer> myThirdNode = new Node<>(56);
        LinkedList<Integer> myLinkedList = new LinkedList<Integer>();
        myLinkedList.addFirst(myFirstNode);
        myLinkedList.addFirst(mySecondNode);
        myLinkedList.addFirst(myThirdNode);
        INode searchNode = myLinkedList.searchNode(30);
        Assertions.assertEquals(searchNode, mySecondNode);
    }
}


