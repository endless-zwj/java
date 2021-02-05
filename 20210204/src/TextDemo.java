public class TextDemo {
    public static void main(String[] args) {
        My_LinkedList myLinkedList = new My_LinkedList() ;
        myLinkedList.addFirst(14);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(10);
        myLinkedList.disPlay();
//        System.out.println(myLinkedList.contains(20));
//        System.out.println(myLinkedList.size());
//        myLinkedList.addIndex(2,34);
//        myLinkedList.disPlay();
//        System.out.println(myLinkedList.size());
//        myLinkedList.remove(12);
//        myLinkedList.disPlay();
//        myLinkedList.removeAll(12);
//        myLinkedList.disPlay();
//        System.out.println(myLinkedList.FindkthToFailPro(2).data);
//        myLinkedList.reverseList();
//        myLinkedList.disPlay();
//        System.out.println(myLinkedList.ListByX(13).data);
//        myLinkedList.disPlay();
        System.out.println(myLinkedList.Del().data);
        myLinkedList.disPlay();
    }
}

