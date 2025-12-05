import java.util.Arrays;

class MyArrayList<T> {
    // --- [資料結構]: Data Structure of an Array List ----
    int DEFAULT_MAX_SIZE = 10 ;
    T[] items  ;
    int size=0; // 就是之前的itemCnt

    // ---  [操作函數]: operation functions of Array List -----
    public MyArrayList() { 
        items = (T[]) new Object[DEFAULT_MAX_SIZE]; 
    }
    MyArrayList(int size) { 
        // DIY: 根據size設定串列大小，若size<DEFAULT_MAX_SIZE，則仍設定為5
       if(size<DEFAULT_MAX_SIZE) size=DEFAULT_MAX_SIZE;
       items=(T[]) new Object[size];
    } 
    public int size() { return size;}
    public int capacity() { return items.length; }   
    
    public void add(T item) { // 將item加入串列末尾
        if (this.size>items.length) {
            System.out.println("add():list is full! size="+size) ;
            System.exit(1) ;            
        }
	this.items[size++] = item ;
	 add(this.size(), item); // [建議]轉發給add(index, item)來執行
    }
    public void add(int index, T item){ //將item加入，成為第index元素
        if (index < 0 || index > size) { // 修正索引檢查
        System.out.println("add(): index out of bound: " + index);
        System.exit(1);
    }

    if (size >= items.length) { // 當陣列滿時，擴充容量
        items = Arrays.copyOf(items, items.length * 2);
    }

    // 挪動 index 之後的元素（從後往前移動，避免覆蓋）
    for (int i = size; i > index; i--) {
        items[i] = items[i - 1];
    }

    items[index] = item;
    size++;      
    }
    public T get(int index) {
        if (index<0 && index>=size) { 
            System.out.println("get(): index out of bound: "+index) ;
            System.exit(1);
        }
        return (T) items[index] ;
    }
    public void set(int index, T item) {
        if (index<0 && index>=size) {
            System.out.println("set(): index out of bound: "+index) ;
            System.exit(1) ; 
        }
        items[index]= item ;
    } 
    public void remove(int index) {
        if (index<0 && index>=size) {
            System.out.println("remove(): index out of bound: "+index) ;
            System.exit(1) ;
        }
        // DIY here
        for(int i=index;i<size-1;i++){
         items[i]=items[i+1];
        }
        items[--size]=null;
    }
    // ===== for P27 ex1 ====
    int indexOf(T item) {
	// 回傳item在items[]中的位置註標，若不存在，則回傳-1
        // 請用equals()函數進行物件相等性比較
        // DIY here
        for(int i=0;i<size;i++){
         if(items[i].equals(item)) return i;
        }
        return -1; 
    }
    void remove(T item) {
        // 刪除串列中所有與item相同的元素
        // DIY here
        int index;
        while((index=indexOf(item))!=-1){
         remove(index);
        }
    }
    void remove(int start, int end) {
    if (start < 0 || end > size || start >= end) {
        System.out.println("remove(): invalid range [" + start + "," + end + ")");
        System.exit(1);
    }
    int shift = end - start;

    // 將後面的元素往前移動
    for (int i = start; i < size - shift; i++) {
        items[i] = items[i + shift];
    }

    // 清除多餘元素
       for (int i = size - shift; i < size; i++) {
        items[i] = null;
    }


    size -= shift;
}
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (!(obj instanceof MyArrayList)) return false;

    MyArrayList<?> other = (MyArrayList<?>) obj;
    if (this.size != other.size) return false;

    for (int i = 0; i < size; i++) {
        if (this.items[i] == null) {
            if (other.items[i] != null) return false;
        } else if (!this.items[i].equals(other.items[i])) {
            return false;
        }
    }
    return true;
}
    
    public String toString() {
        return Arrays.toString(Arrays.copyOf(items, size))+
                ", size="+size+", capacity="+items.length  ;
    }
}

public class MI2C_HWK2_412631383_02 {
    public static void main(String[] args) {
        test1() ; 
        // test2() ; 
    }
    private static void test1() {
        MyArrayList<Integer> L1 = new MyArrayList<>();
        
        System.out.println("------ test add(item) ----- ");
        L1.add(1);  L1.add(3);  L1.add(5);   L1.add(7);
        L1.add(9);
        System.out.println("L1=" + L1); // L1=[1, 3, 5, 7, 9], size=5, capacity=10 
        
        System.out.println("------ test add(index, item) ----- ");
        L1.add(0, 11);  L1.add(2, 33);   L1.add(L1.size(), 99);
        System.out.println("L1=" + L1); // L1=[11, 1, 33, 3, 5, 7, 9, 99], size=8, capacity=10 
        
        System.out.println("------ test remove(index) ----- ");
        L1.remove(0);  L1.remove(L1.size());  L1.remove(1);
        System.out.println("L1=" + L1); // L1=[1, 3, 5, 7, 9], size=5, capacity=10 
    }
    private static void test2() {
        MyArrayList list = new MyArrayList() ;
        for (int i=0; i<5; i++) {
            list.add("T-"+i) ;
        }
        System.out.println("list="+list);
        
        for (int i=10; i<20; i++) {
            list.add("T-"+i) ;
        }
        System.out.println("list="+list);   
        
        System.out.println(list.indexOf("T-10")); // 5
        System.out.println(list.indexOf("T-25")); // -1
        
        list.remove("T-10") ;
        list.remove("T-0") ;
        list.remove("T-19");
        System.out.println("list="+list);   
        
        list.remove(3,6); // remove items[3~5]
        System.out.println("list="+list);   
        
        MyArrayList list2 = new MyArrayList() ;
        for (int i=0; i<list.size(); i++) {
            list2.add(list.get(i)) ;
        }
        System.out.println("list.equals(list2)="+list.equals(list2));
        list2.remove("T18");
        System.out.println("list.equals(list2)="+list.equals(list2));        
    }
}
/* [程式輸出]: for test2() 
list=[T-0, T-1, T-2, T-3, T-4], size=5, capacity=10
list=[T-0, T-1, T-2, T-3, T-4, T-10, T-11, ..., T19], size=15, capacity=20
5
-1
list=[T-1, T-2, T-3, T-4, T-11, T12,..., T18], size=12, capacity=20
list=[T-1, T-2, T-3,  ..., T18], size=9, capacity=20
list.equals(list2)=true
list.equals(list2)=false
*/    

