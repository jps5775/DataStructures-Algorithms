package DataStructures;

public class MyQueue {

    private class QueueNode{
        int data;
        QueueNode next;
        public QueueNode(int data){
            this.data = data;
        }
    }

    QueueNode front = null;
    QueueNode rear = null;

    public void enqueue(int value){
        QueueNode newNode = new QueueNode(value);

        if(rear == null){
             rear = newNode;
             front = rear;
        }else{
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeue() throws Exception{
        if(front == null){
            return -1;
            //throw new Exception("Queue is Empty");
        }else {
            int deleted = front.data;
            front = front.next;
            if(front == null){
                rear = null;
            }
            return deleted;
        }

    }



    public static void main(String[] args) throws Exception {
        MyQueue queue = new MyQueue();
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(6);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(6);
        System.out.println(queue.rear.data);
        System.out.println(queue.front.data);
    }

}
