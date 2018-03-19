package com.eriy.structure.link;

/**
 * 单向链表
 *
 * @author sunny
 * @create 2018/3/19 13:53
 **/
public class SingleLinkNode {
    int data;
    SingleLinkNode next;

    public SingleLinkNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public SingleLinkNode getNext() {
        return next;
    }

    public void setNext(SingleLinkNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "SingleLinkNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }



}
