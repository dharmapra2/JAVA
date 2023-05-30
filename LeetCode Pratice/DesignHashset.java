import java.io.*;
import java.util.LinkedList;

class DesignHashet {

  public static void main(String[] args) throws IOException {
    MyHashSet obj = new MyHashSet();
    obj.add(2);
    obj.add(3);
    obj.add(4);
    obj.add(5);
    obj.remove(2);
    boolean param_3 = obj.contains(3);
    System.out.println(param_3);
  }
}

class MyHashSet {

  private final int size = 1000000;
  private LinkedList<Integer>[] hashSet;

  public MyHashSet() {
    hashSet = new LinkedList[size];
  }

  private int hash(int key) {
    return key % size;
  }

  public void add(int key) {
    int index = hash(key);
    LinkedList<Integer> bucket = hashSet[index];
    if (bucket == null) {
      hashSet[index] = new LinkedList<>();
      bucket = hashSet[index];
    }

    if (!bucket.contains(key)) {
      bucket.add(key);
    }
  }

  public void remove(int key) {
    int index = hash(key);
    LinkedList<Integer> bucket = hashSet[index];
    if (bucket != null) {
      bucket.remove(Integer.valueOf(key));
    }
  }

  public boolean contains(int key) {
    int index = hash(key);
    LinkedList<Integer> bucket = hashSet[index];
    return bucket != null && bucket.contains(key);
  }
}
