public class TextDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList() ;
        myLinkedList.addLast(12);
        myLinkedList.addLast(14);
        myLinkedList.addLast(16);
        myLinkedList.addLast(17);
        myLinkedList.disPlay();
        //System.out.println(myLinkedList.Contain(20));
        //System.out.println(myLinkedList.size());
        myLinkedList.addIndex(5,34);
        myLinkedList.disPlay();
    }
}
