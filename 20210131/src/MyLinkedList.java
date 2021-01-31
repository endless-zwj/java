class Node {
    public int data ;
    public Node next ;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MyLinkedList {
    Node head = null ;

    //<1>头插法
    public void addFirst(int data) {
        Node node = new Node(data) ;

        //第一次插入数据
        if (this.head == null) {
            this.head = node ;
            return ;
        }

        node.next = this.head;
        this.head = node ;
    }

    //<2>打印单链表
    public void disPlay() {
        Node cur = this.head ;
        while ( cur != null ) {
            System.out.print(cur.data + " ");
            cur = cur.next ;
        }
        System.out.println();
    }

    //<3>尾插法
    public void addLast(int data) {
        Node node = new Node(data) ;

        //第一次插入
        if (this.head == null) {
            this.head = node ;
            return ;
        }

        Node cur = this.head ;

        //找到最后一个节点
        while(cur.next != null) {
            cur = cur.next ;
        }

        cur.next = node ;
    }

    //<4>查找是否有关键字key在单链表当中
    public boolean Contain (int key) {
        Node cur = this.head ;

        while(cur != null) {
            if (cur.data == key) {
                return true ;
            }

            cur = cur.next ;
        }
        return false ;
    }

    //<5>得到单链表的长度
    public int size () {
        Node cur = this.head ;
        int count = 0 ;

        while(cur != null) {
            count++ ;
            cur = cur.next ;
        }
        return count ;
    }

    //<6>任意位置插入节点，第一节点下标为 0
    private void JudgeIndex(int Index) {
        if ( Index < 0 || Index > this.size()) {
            throw new RuntimeException("下标不合理") ;
        }
    }

    private Node SearchIndex(int count) {
        Node cur = this.head ;
        while( count != 0 ) {
            cur = cur.next ;
            count--;
        }
        return cur ;
    }
    public void addIndex (int Index , int data) {
        Node node = new Node(data);
        //1.检查下标的合理性
        this.JudgeIndex(Index);
        //2.特殊位置插入节点
        if (Index == 0) {
            this.addFirst(data);
            return;
        }
        if(Index == this.size() - 1 ) {
            this.addLast(data);
            return;
        }
        //3.一般位置插入，先找到Index-1位置处下标
        Node cur = this.SearchIndex(Index-1) ;
        node.next = cur.next ;
        cur.next = node ;
    }
}
