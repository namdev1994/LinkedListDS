package linkedlist;

public class LinkedList<T> {
    public INode<T> head;
    public INode<T> tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void addFirst(INode newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }
    /* Add Last */
    public void append(INode newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        if (this.tail == null) {
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode);
            this.tail = newNode;
        }
    }
    public void insertNode(INode<Integer> myFirstNode, INode<Integer> mySecondNode) {
        mySecondNode.setNext(myFirstNode.getNext());
        myFirstNode.setNext(mySecondNode);
    }
    /* Delete First Node */
    public INode pop() {
        INode  tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    /* Delete Last Node */
    public INode popLast() {
        INode tempNode = head;
        while (!tempNode.getNext().equals(tail)) {
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        return null;
    }
    /* Search Node with given key */
    public INode searchNode(T key) {
        INode tempNode = this.head;
        while (tempNode != null) {
            if (tempNode.getData() == key) {
                return tempNode;
            }
            tempNode = tempNode.getNext();
        }
        return null;
    }
    /* delete the specified element from the linked list */
    public void remove(INode removeNode) {
        INode myTempNode = head;
        while (myTempNode.getNext() != removeNode) {
            myTempNode = myTempNode.getNext();
        }
        INode myTempNode2 = myTempNode;
        myTempNode2 = myTempNode.getNext().getNext();
        myTempNode.setNext(myTempNode2);
    }
    public void getSize(INode head) {
        int nodeCount = 0;
        INode temp = head;
        while (temp != null) {
            nodeCount++;
            temp = temp.getNext();
        }
        System.out.println("Size: " + nodeCount);
    }

    public void printMyNodes() {
        INode tempNode = this.head;
        StringBuffer displayNode = new StringBuffer("My Nodes: ");
        while (tempNode.getNext() != null) {
            displayNode.append(tempNode.getData());
            if (!tempNode.equals(this.tail)) {
                displayNode.append("->");
            }
            tempNode = tempNode.getNext();
        }
        displayNode.append(tempNode.getData());
        System.out.println(displayNode);

    }
}
