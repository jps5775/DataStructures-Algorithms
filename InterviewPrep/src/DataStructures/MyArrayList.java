package DataStructures;

public class MyArrayList<T> {
    public int length;
    private T[] array;
    private int index;

    public MyArrayList(int length){
        this.length = length;
        array = (T[])new Object[length];
        index = 0;
    }

    public void put(T value){
        if(index == length){
            resize();
        }
        array[index] = value;
        index++;
    }

    public T get(int getIndex) throws Exception {
        if(getIndex >= index || getIndex < 0){
            throw new Exception("Can't get value of index");
        }
        return this.array[getIndex];
    }

    private void resize(){
        length = length * 2;
        T[] newArray = (T[])new Object[length];

        for(int i = 0; i < array.length; i++){
            newArray[i] = array[i];
        }

        this.array = newArray;
    }


    public static void main(String[] args) throws Exception {
        MyArrayList<Integer> list = new MyArrayList<>(2);

        list.put(5);
        list.put(10);
        list.put(15);
        System.out.println(list.length);
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        Thread.sleep(3000);
        list.get(-1);



    }
}
