package com.eriy.structure.link;

/**
 * 单向链表
 *
 * @author sunny
 * @create 2018/3/19 14:29
 **/
public class SingleLink {
    private SingleLinkNode head = new SingleLinkNode(0);

    /**
     * 单向链表的长度
     * @return
     */
    public int length(){
        int count =0 ;
        SingleLinkNode temp = head;
        while(temp.next!=null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    /**
     * 某个位置插入
     * @param index
     * @param node
     * @return
     */
    public void insertByIndex(int index,SingleLinkNode node){
        if( index<1 || index>this.length()+1){
            System.out.println("插入位置不合法");
            return;
        }
        int length = 1;
        SingleLinkNode temp = head;
        while(temp.next!=null ){
            if(index ==length++) {
                node.next = temp.next;
                temp.next = node;
                return ;
            }
            temp = temp.next;
        }
    }

    /**
     * 链表最后插入
     * @param node
     */
    public void insert(SingleLinkNode node){
        SingleLinkNode temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
    }

    /**
     * 删除某个位置的节点
     * @param index
     */
    public void delByIndex(int index){
        if( index<1 || index>this.length()+1){
            System.out.println("删除位置不合法");
            return;
        }
        int length = 1;
        SingleLinkNode temp = head;
        while(temp.next!=null ){
            if(index ==length++) {
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    /**
     * 链表排序
     */
    public void sort(){

    }

    /**
     * 链表反转
     * @param link
     * @return
     */
    public SingleLinkNode reverseSingleLink(SingleLink link){
        SingleLinkNode head = link.head;
        SingleLinkNode now = head.next;
        SingleLinkNode temp ;
        head.next = null;
        while(now!=null){
            temp= now.next;
            now.next = head;
            head = now;
            now = temp;
        }
        return head;
    }

    /**
     * 单向链表反转，递归（有去有回）
     * 递归找到node.next 的节点满足基本条件，就是找到最后一个节点满足条件，此时当前节点最后一个节点的前一个节点，将这俩个节点反转，再递归回到第一个节点，
     * @param node
     * @return
     */
    public SingleLinkNode reverseRecurision(SingleLinkNode node){
        if (node == null || node.next == null){
            return node;
        }

        SingleLinkNode reNode= reverseRecurision(node.next);
        node.next.next=node;
        node.next=null;
        return reNode;
    }

        private void print(){
        SingleLinkNode temp = head;
        StringBuffer stringBuffer = new StringBuffer(128);
        while(temp.next!=null){
            stringBuffer.append(temp.getData()).append(",");
            temp =temp.next;
        }
        stringBuffer.append(temp.getData()).append(",");
        if(stringBuffer.lastIndexOf(",")>0){
            System.out.println(stringBuffer.substring(0,stringBuffer.length()-1));
        }
    }


    public static void main(String[] args) {
        SingleLink singleLink = new SingleLink();
        for(int i=1;i<3;i++){
            SingleLinkNode node = new SingleLinkNode(i);
            singleLink.insert(node);
        }
        SingleLinkNode node = singleLink.reverseRecurision(singleLink.head);
        singleLink.head = node;
        singleLink.print();

    }
}
