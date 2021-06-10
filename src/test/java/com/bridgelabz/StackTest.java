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

    @Test
    public void given3NumsIntoStack_WhenPopped_ShouldHaveLastAddedOut(){
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        Stack stack = new Stack();
        stack.push(firstNode);
        stack.push(secondNode);
        stack.push(thirdNode);
        INode pop = stack.pop();
        stack.printStack();
        Assertions.assertEquals(thirdNode, pop);
    }
    @Test
    public void given3Nums_WhenEnqueued_ShouldBeLast() {
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        Stack stack = new Stack();
        stack.enqueue(firstNode);
        stack.enqueue(secondNode);
        stack.enqueue(thirdNode);
        stack.printStack();
        Assertions.assertEquals( stack.lastestElementOfStack(), firstNode);
    }
    @Test
    public void whenDequeued_TailShouldBeMovedBackOneNode() {
        Node<Integer> firstNode = new Node<>(70);
        Node<Integer> secondNode = new Node<>(30);
        Node<Integer> thirdNode = new Node<>(56);
        Stack stack = new Stack();
        stack.enqueue(firstNode);
        stack.enqueue(secondNode);
        stack.enqueue(thirdNode);
        stack.dequeue();
        Assertions.assertEquals(stack.firstElementOfQueue(), secondNode);
    }
}
