package javaLearing;

import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;

/**
 * 双向链表
 */
public class MyLikedList {
    Node head;
    Node tail;

    //<1>头插法
    public void addFirst(int val) {
        Node node = new Node(val);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
            return;
        }

        node.next = this.head;
        this.head.prev = node;
        this.head = node;
    }

    //<2>打印单链表
    public void disPlay() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //<3>尾插法
    public void addLast(int val) {
        Node node = new Node(val);
        if (this.head == null) {
            this.head = node;
            this.tail = node;
            return;
        }
        this.tail.next = node;
        node.prev = this.tail;
        this.tail = node;
    }

    //<4>计算单链表的长度
    public int wide() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //<5>在任意位置处插入，第一个数据节点为 0号下标
    private Node findPos(int Index) {
        Node cur = this.head;
        while (Index != 0) {
            cur = cur.next;
            Index--;
        }
        return cur;
    }

    public void addIndex(int Index, int val) {
        Node node = new Node(val);

        if (Index < 0 || Index > this.wide()) {
            throw new RuntimeException("下标异常");
        }
        if (Index == 0) {
            this.addFirst(val);
            return;
        }
        if (Index == this.wide()) {
            this.addLast(val);
            return;
        }

        Node cur = findPos(Index);
        node.prev = cur.prev;
        node.next = cur;
        cur.prev.next = node;
        cur.prev = node;
    }

    //<6>删除双向链表当中第一次出现的key
    public void remove(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.val == key) {
                break;
            }
            cur = cur.next;
        }
        assert this.head != null;
        if (this.head.val == key) {
            this.head = this.head.next;
            this.head.prev = null;
            return;
        }
        if (cur != null) {
            cur.prev.next = cur.next;
            if (cur == this.tail) {
                this.tail = cur.prev;
            } else {
                cur.next.prev = cur.prev;
            }
            return;
        }
        System.out.println("该链表没有"+key+"值");
    }

    //<7>删除链表中出现的所有 key值
    public void removeAll (int key) {
        Node cur = this.head ;
        while(cur != null) {
            while (cur != null) {
                if (cur.val == key) {
                    break;
                }
                cur = cur.next;
            }
            if (this.head.val == key) {
                this.head = this.head.next;
                this.head.prev = null;
                cur = this.head ;
                continue;
            }
            if (cur != null) {
                cur.prev.next = cur.next;
                if (cur == this.tail) {
                    this.tail = cur.prev;
                    break;
                } else {
                    cur.next.prev = cur.prev;
                }
            }
        }
    }
}