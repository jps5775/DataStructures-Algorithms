package DataStructures.Heap;

import java.util.Arrays;

public class MinHeap {

    private int capacity = 10;
    private int size = 0;

    int[] heap = new int[capacity];

    // helper methods
    private int getLeftChildIndex(int parentIndex){ return 2 * parentIndex + 1; }
    private int getRightChildIndex(int parentIndex){ return 2 * parentIndex + 2; }
    private int getParentIndex(int childIndex){ return (childIndex - 1) / 2; }

    private boolean hasLeftChild(int index){ return getLeftChildIndex(index) < size; }
    private boolean hasRightChild(int index){ return getRightChildIndex(index) < size; }
    private boolean hasParent(int index){ return getParentIndex(index) >= 0; }

    private int leftChild(int index){ return heap[getLeftChildIndex(index)]; }
    private int rightChild(int index){ return heap[getRightChildIndex(index)]; }
    private int parent(int index){ return heap[getParentIndex(index)]; }

    private void swap(int indexOne, int indexTwo){
        int temp = heap[indexOne];
        heap[indexOne] = heap[indexTwo];
        heap[indexTwo] = temp;
    }

    private void ensureExtraCapacity(){
        if(size == capacity){
            heap = Arrays.copyOf(heap, capacity * 2);
            capacity = capacity * 2;
        }
    }

    public int peek(){
        if(size == 0){ throw new IllegalStateException(); }
        return heap[0];
    }

    public int extractMin(){
        if(size == 0){ throw new IllegalStateException(); }
        int item = heap[0];
        heap[0] = heap[size - 1];
        size--;
        heapifyDown();
        return item;
    }

    public void insert(int value){
        ensureExtraCapacity();
        heap[size] = value;
        size++;
        heapifyUp();
    }

    private void heapifyUp(){
        int added = heap[size - 1];
        while(hasParent(added) && parent(added) > heap[added]){
            swap(getParentIndex(added), added);
            added = getParentIndex(added);
        }
    }

    public void heapifyDown(){
        int index = 0;
        while(hasLeftChild(index)){
            int smallerChildIndex = getLeftChildIndex(index);
            if(hasRightChild(index) && rightChild(index) < leftChild(index)){
                smallerChildIndex = getRightChildIndex(index);
            }

            if(heap[index] < heap[smallerChildIndex]){
                break;
            }else{
                swap(index, smallerChildIndex);
            }

            index = smallerChildIndex;
        }
    }



}
