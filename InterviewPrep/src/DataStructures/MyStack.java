package DataStructures;

public class MyStack {

    private class StackNode{
        int data;
        StackNode next;
        public StackNode(int data){
            this.data = data;
        }
    }

    StackNode head = null;

    public void put(int value){

        StackNode newNode = new StackNode(value);

        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }

    }

    public int pop() throws Exception{
        if(head == null){
            throw new Exception("Stack is empty");
        }else{
            int deleted = head.data;
            head = head.next;
            return deleted;
        }
    }


    public static void main(String[] args) throws Exception {
        MyStack stack = new MyStack();
        stack.put(4);
        stack.put(3);
        stack.put(6);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.put(6);
        System.out.println(stack.pop());

    }

}
