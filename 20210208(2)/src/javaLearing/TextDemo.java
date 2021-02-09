package javaLearing;

public class TextDemo {
    public static void main(String[] args) {
        MyLikedList myLikedList = new MyLikedList() ;
        myLikedList.addLast(23);
        myLikedList.addLast(23);
        myLikedList.addLast(23);
        myLikedList.addLast(23);
        myLikedList.disPlay();
        System.out.println(myLikedList.wide());
        myLikedList.addIndex(4,15);
        myLikedList.disPlay();
        myLikedList.removeAll(15);
        myLikedList.disPlay();
    }
}
