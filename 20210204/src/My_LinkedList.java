 public class My_LinkedList {
    Node head = null ;
    //<1>头插法
    public void addFirst(int data) {
        Node node = new Node(data) ;
        if(this.head == null)
        {
            this.head = node ;
            return;
        }
        node.Next = this.head;
        this.head = node ;
    }

    //<2>尾插法
    public void addLast(int data) {
        Node node = new Node(data) ;
        if(this.head == null) {
            this.head = node ;
            return;
        }
        Node cur = this.head ;
        while(cur.Next != null) {
            cur = cur.Next;
        }
        cur.Next = node ;
    }

    //<3>打印单链表
    public void disPlay() {
        Node cur = this.head ;
        while(cur != null ) {
            System.out.print(cur.data + " ");
            cur = cur.Next ;
        }
        System.out.println();
        System.out.println("==================") ;
    }

    //<4>查找是否包含关键字key在链表当中
    public boolean contains(int key) {
        Node cur = this.head ;
        while(cur != null) {
            if(cur.data == key) {
                return true ;
            }
            cur = cur.Next;
        }
        return false ;
    }

    //<5>得到单链表的长度
    public int size () {
        Node cur = this.head ;
        int count = 0 ;
        while(cur != null) {
            count++ ;
            cur = cur.Next ;
        }
        return count;
    }

    //<6>清空链表
    public void clears () {
        this.head = null ;
    }

    //<7>在任意位置处插入，第一个节点下标为 0
    private void checkPos(int Index) {
        if( Index < 0 || Index > this.size() - 1) {
            throw new RuntimeException("坐标异常") ;
        }
    }

    private Node indexSearch(int count) {
        Node cur = this.head ;
        while(count != 0) {
            cur = cur.Next ;
            count--;
        }
        return cur ;
    }
    public void addIndex (int Index , int val) {
        Node node = new Node(val);
        //判断位置的合法性
        checkPos(Index);
        //特殊位置处理
        if (Index == 0) {
            this.addFirst(val);
            return;
        }
        if(Index == this.size() - 1) {
            this.addLast(val);
            return ;
        }
        //一般情况判断
        Node cur = this.indexSearch( Index -1) ;
        node.Next = cur.Next ;
        cur.Next = node ;
    }

    //<8>删除第一次出现关键字为key的节点
     private Node SearchPrev(int key) {
         Node prev = this.head;
         //非头节点出现 key
         while( (prev.Next) != null) {
             if(prev.Next.data == key) {
                return prev;
             }
             prev = prev.Next ;
         }
         return null;
     }

     public void remove(int key) {
         //头节点出现 key
         if(this.head.data == key) {
             this.head = this.head.Next ;
             return;
         }
         Node prev = this.SearchPrev(key) ;
         if (prev == null) {
             System.out.println("该链表中无该值!");
             return;
         }
         Node del = prev.Next ;
         prev.Next = del.Next ;
     }

     //<9>删除所有值为 key的节点
     public void removeAll(int key) {
        Node prev = this.head ;
        Node del = prev.Next ;
        while(del != null) {
            if(del.data == key) {
                prev.Next = del.Next ;
                del = del.Next;
            } else {
                prev = del ;
                del = del.Next;
            }
        }
        if(this.head.data == key) {
            this.head = this.head.Next ;
        }
     }

     //<10>给定一个带头节点的非空单链表。返回链表的中间节点，
     //如果有两个节点，则返回第二个中间节点
     public Node returnMid () {
        Node fast = this.head ;
        Node slow = this.head ;
        while(fast != null && fast.Next != null) {
            fast = fast.Next.Next ;
            slow = slow.Next;
        }
        return slow ;
     }

     //<11>输出倒数第 k个节点
     public Node FindkthToFail(int k) {
        if( k <= 0 || k > this.size()  ) {
            throw new RuntimeException("输入的K错误") ;
        }
        Node fast = this.head ;
        Node slow = this.head ;
        while( k != 0) {
            fast = fast.Next ;
            k--;
        }
        while(fast != null) {
            fast = fast.Next ;
            slow = slow.Next ;
        }
        return slow;
     }

     //<12>求倒数第 k个节点 pro
     public Node FindkthToFailPro (int k) {
        Node fast = this.head ;
        Node slow = this.head ;
        while( (k-1) > 0) {
            if (fast.Next != null) {
                fast = fast.Next ;
            } else {
                throw new RuntimeException("没有这个节点");
            }
            k--;
        }
        while(fast.Next != null) {
            fast = fast.Next ;
            slow = slow.Next ;
        }
         return slow ;
     }
     //<13>逆序单链表
     public void reverseList() {
        Node prev = null ;
        Node cur  = this.head ;
        Node curNext = cur.Next ;
        while(curNext != null) {
            cur.Next = prev ;
            prev = cur ;
            cur = curNext ;
            curNext = cur.Next ;
        }
        cur.Next = prev ;
        this.head = cur ;//交换头节点，因为display函数是从头节点开始打印，以前的头节点成为了逆序链表的尾结点
     }
    //<14>以x为分割线，小于x的节点排在大于x的前面
     public Node ListByX (int x ) {
        Node cur = this.head ;
        Node as = null ;
        Node ae = null ;
        Node bs = null ;
        Node be = null ;
        //分堆
        while(cur != null) {
            if (cur.data < x ) {
                if(as == null ) {
                    as = cur ;
                    ae = cur ;
                } else {
                    ae.Next = cur ;
                    ae = cur ;
                }
            } else {
                if(bs == null ) {
                    bs = cur ;
                    be = cur ;
                } else {
                    be.Next = cur ;
                    be = cur ;
                }
            }
            cur = cur.Next ;
        }
        //拼接
         if (ae == null) {
             return bs ;
         } else if ( bs == null) {
             return as ;
         } else {
             ae.Next = bs ;
             if(be.Next != null) {
                 be.Next = null ;
             }
             return as ;
         }
     }

     //<15>在一个排序的链表中，删除重复节点（不保留）,返回头节点指针
     public Node Del () {
        Node NewHead = new Node(-1) ;
        Node tmp = NewHead ;
        Node cur = this.head ;
        while(cur != null) {
            if( (cur.Next != null) && (cur.data == cur.Next.data)) {
                while((cur.Next != null) && (cur.data == cur.Next.data)) {
                    cur = cur.Next ;
                }
                cur = cur.Next ;
            } else {
                tmp.Next = cur ;
                tmp = tmp.Next ;
                cur = cur.Next ;
            }
        }
        return NewHead.Next;
     }
}
