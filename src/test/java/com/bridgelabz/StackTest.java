package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTest {

    @Test
    public void given3Nums_WhenAdded_ShouldHaveLastAdded(){
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        Stack stack = new Stack();
        stack.push(firstNode);
        stack.push(secondNode);
        stack.push(thirdNode);
        stack.printStack();
        INode peak = stack.peak();
        Assertions.assertEquals(thirdNode, peak);
    }

}
