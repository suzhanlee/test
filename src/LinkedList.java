

public class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    private class Node{
        private Object data;
        private Node next;

        public Node(Object input){
            this.data = input;
            this.next = null;

        }
        public String toString(){
            return String.valueOf(this.data);

        }

    }
    public void addFirst(Object input){
        Node newNode = new Node(input);
        newNode.next = head;  // 반대아닌가? head.next = newNode; 아니데 맞다 앞에다 추가하는거기에 처음생성된 노드는 계속 tail으로 설정한것임.
        head = newNode;
        size++;
        if(head.next ==null){
            tail = head;
        }


    }
    public void addLast(Object input){
        Node newNode = new Node(input);
        if(size ==0){
            addFirst(input);
        }else{
            tail.next = newNode;
            tail = newNode;
            size++;

        }

    }
     Node node(int index){
        Node x = head;
        for (int i = 0; i < index; i++) {
            x = x.next;

        }


        return x;


    }



}

