package linkedlist;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 *  created a test class.
 *  check the linkedList by putting the values.
 */
public class NodeTest {
    @Test
    public void GivenThreeNumbersWhenLinkedShouldPassLinkedListTest() {
        Node<Integer> myFirstNode = new Node<>(56);
        Node<Integer> mySecondNode = new Node<>(30);
        Node<Integer> myThirdNode = new Node<>(70);
        myFirstNode.setNext(mySecondNode);
        mySecondNode.setNext(myThirdNode);
        boolean result = (myFirstNode.getNext().equals(mySecondNode) && mySecondNode.getNext().equals(myThirdNode));
        Assertions.assertTrue(result);
    }
}
