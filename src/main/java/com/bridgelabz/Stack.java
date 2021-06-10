package com.bridgelabz;

public class Stack {
    private final NewLinkList linkList;

    public Stack() {
        this.linkList = new NewLinkList();
    }

    public void push(INode node){
        linkList.add(node);
    }
    public void printStack(){
        linkList.printNodes();
    }
    public INode peak(){
        return linkList.head;
    }
    public INode pop() {
        return linkList.pop();
    }


}