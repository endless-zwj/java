import java.util.Arrays;

class ArrayList {
    public int[] element;
    public int usedSized;
    public static int intCapacity = 10;

    public ArrayList() {
        this.element = new int[intCapacity];
        this.usedSized = 0;
    }

    public boolean IsFull () {
        return  this.element.length == this.usedSized ;
    }

    //<1>在某一位置上插入（增加）一个数
    public void Add (int pos , int val) {
        //  1.判断数组是否满了，如果是便对其二倍扩容
        if (IsFull()) {
            this.element =
                    Arrays.copyOf(this.element, 2 * this.element.length);
        }
        // 2.判断插入数组位置是否合理
        if (pos < 0 || pos > this.usedSized) {
            System.out.println("输入坐标越界！！");
            return;
        } else {
            for (int i = usedSized - 1; i >= pos; i--) {
                element[i + 1] = element[i];
            }
        }
        element[pos] = val ;
        usedSized++ ;
    }

    //<2>打印数组
    public void Display () {
        for (int i = 0; i < this.usedSized - 1 ; i++) {
            System.out.print(this.element[i] + " ");
        }
        System.out.println();
        System.out.println("===========================");
    }

    //<3>判断是否包含某个数，是的话返回下标
    public boolean Contain(int toFind) {
        for (int i = 0; i < this.usedSized - 1; i++) {
            if (this.element[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    //<4>查找某个元素对应的位置
    public int Search (int toFind) {
        for (int i = 0; i < this.usedSized - 1; i++) {
            if (this.element[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    //<5>给某个位置的数字赋值
    public void CheckPos (int pos ) {
        if ( pos < 0 || pos >= usedSized)
        {
            throw new RuntimeException("位置异常") ;
        }
    }

    public void SetPos (int pos ,int val) {
        CheckPos(pos);
        element[pos] = val ;
    }

    //<6>获得某个下标下的数字
    public int GetPos(int pos) {
        CheckPos(pos);
        return this.element[pos] ;
    }

    //<7>删除第一次出现的关键字key
    public void Delete(int key) {
        for (int i = 0; i <this.usedSized - 1 ; i++) {
            if(this.element[i] == key)
            {
                for(int j = i ; j < this.usedSized -1 ; j++) {
                    this.element[i] = this.element[i+1] ;
                }
                break;
            }
        }
    }

    //<8>清空顺序表
    public void Clear() {
        usedSized = 0 ;
    }
}


public class TextDemo {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
//在element数组中放入元素
        for (int i = 0 ; i < 10 ;i++ )  {
        arrayList.Add(i,i);
        }

        //System.out.println(Arrays.toString(arrayList.element));  循环遍历
        //成员方法打印
        arrayList.Display();
        arrayList.Add(20,23);

        //for (int i = 0; i <arrayList.usedSized - 1 ; i++) {
            //System.out.print(arrayList.element[i] + " ");
        //成员方法打印
        arrayList.Display();
        System.out.println(arrayList.Contain(24));
        System.out.println(arrayList.Search(4));
        arrayList.SetPos(3, 24);
        arrayList.Display();
        System.out.println(arrayList.GetPos(5));
        arrayList.Delete(1000);
        arrayList.Display();
        System.out.println("*******");
        arrayList.Clear();
        arrayList.Display();
    }
}
