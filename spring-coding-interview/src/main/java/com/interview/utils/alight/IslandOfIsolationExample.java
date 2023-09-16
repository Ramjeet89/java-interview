package com.interview.utils.alight;

class Node {
    Node next;

    Node() {
        this.next = null;
    }
}

public class IslandOfIsolationExample {
    public static void main(String[] args) {
        Node node1 = new Node();
        Node node2 = new Node();

        // Create an island of isolation
        node1.next = node2;
        node2.next = node1;

        // Both node1 and node2 are now unreachable from the root
        node1 = null;
        node2 = null;

        // At this point, the island of isolation can be garbage collected
        // because there are no references to it from the root.
        // The memory occupied by node1 and node2 can be reclaimed.
    }
}
