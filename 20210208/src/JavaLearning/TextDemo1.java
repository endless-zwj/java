package JavaLearning;

public class TextDemo1 {

    //<1>判断两链表的共节点
    public static Node getIntersectionNode(Node headA , Node headB) {
        int lenA = 0 ;
        int lenB = 0 ;
        int len ;
        Node pl = headA ;
        Node ps = headB ;
        while(pl != null) {
            lenA++ ;
            pl = pl.next ;
        }
        while(ps != null) {
            lenB++ ;
            ps = ps.next ;
        }
        if(lenA < lenB) {
            len = lenB - lenA ;
            pl = headB ;
            ps = headA ;
        } else {
            len = lenA - lenB ;
            pl = headA ;
            ps = headB ;
        }
        while(len != 0) {
            pl = pl.next ;
            len--;
        }
        while( pl != ps) {
            pl = pl.next ;
            ps = ps.next ;
        }
        return pl ;
    }

    //<2>创造共节点
    public static void createCut (Node headA , Node headB) {
        headA.next = headB.next.next ;
    }

    //<3>将两链表的 val域按从小到大的顺序串成一个链表
    public static void OneList (Node headA , Node headB) {
        Node tmp = new Node(-1) ;
        Node list1 = headA ;
        Node list2 = headB ;
        while( list1 != null || list2 != null) {

        }
    }

    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(12);
        myLinkedList.addFirst(13);
        myLinkedList.addFirst(13);
        myLinkedList.addFirst(12);
        myLinkedList.disPlay();
        System.out.println(myLinkedList.IsPalindrome());

    }
}
