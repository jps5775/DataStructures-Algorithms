package DataStructures;

public class MyHashTable {

    public Node[] listOfLists;
    int length;

    public MyHashTable(int length){
        this.length = length;
        listOfLists = new Node[length];
    }

    public void put(String key, String value){
        int hash = getHash(key);
        int index = hash % length;

        Node curr = listOfLists[index];
        while(curr != null){
            curr = curr.next;
        }

        curr = new Node(key, value);
        System.out.println(curr.key);
        System.out.println(curr.value);
    }

    public String get(String key){
        int hash = getHash(key);
        int index = hash % length;

        Node curr = listOfLists[index];
        while(curr != null){
            if(curr.key.equals(key)){
                return curr.value;
            }
        }
        return "Not in HashTable";
    }

    private int getHash(String key){
        return key.length() * 2;
    }

    public static void main(String[] args) {
        MyHashTable table = new MyHashTable(4);
        table.put("Joe", "215");
        table.put("Jon", "213");
        System.out.println(table.get("Jon"));
        System.out.println(table.get("Jane"));
    }

}

class Node{
    String key;
    String value;
    Node next;
    Node(String key, String value) {
        this.key = key;
        this.value = value;
    }
}
