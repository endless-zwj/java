package JavaLearning;

public class MyLinkedList {
    Node head ;
    //<1>头插法
    public void addFirst(int val) {
        Node node = new Node(val) ;
        if (this.head == null) {
             this.head = node ;
            return ;
        }

        node.next = this.head ;
        this.head = node ;
    }

    //<2>打印单链表
    public void disPlay() {
        Node cur = this.head ;
        while(cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next ;
        }
    }

    //<3>判断一个单链表是否回文
    public boolean IsPalindrome() {
        Node fast = this.head ;
        Node slow = this.head ;

        //若单链表无节点
        if(this.head == null) {
            return false ;
        }

        //（1）找到中间节点

        while((fast != null) && (fast.next != null) ) {
            fast = fast.next.next ;
            slow = slow.next ;
        }
        //（2）逆序后半部分的链表
        Node cur = slow.next ;
        while(cur != null) {
            cur.next = slow ;
            slow = cur ;
            cur = cur.next ;
        }
        //（3）判断是否回文
        //此时：slow指向最后一个节点，head指向第一个节点

        //若单链表只有一个节点
        if(slow == this.head) {
            return true ;
        }
        while( (this.head != slow) || (this.head.next != slow) ) {
            if( this.head.val != slow.val) {
                return false ;
            }
            this.head = this.head.next;
            slow = slow.next ;
        }
        return true ;
    }

    //<4>判断一个单链表是否成环
    public boolean hasCycle() {
        Node fast = this.head ;
        Node slow = this.head ;
        while (fast!= null && fast.next != null ) {
            fast = fast.next.next ;
            slow = slow.next ;
            if(fast == slow) {
                return true ;
            }
        }
        return false ;
    }

    //<5>找出成环单链表的环节点
    public Node detectCycle () {
        Node fast = this.head ;
        Node slow = this.head ;
        while(fast != null && fast.next != null) {
            fast = fast.next.next ;
            slow = slow.next ;
            if(fast == slow) {
                break;
            }
        }
        if(fast == null || fast.next == null) {
            return null ;
        }
        Node cur = fast ; //标记相遇节点
        slow = this.head ;//重置slow节点
        while(slow != cur) {
            slow = slow.next ;
            cur = cur.next ;
        }
        return cur ;
    }

}
