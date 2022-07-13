import com.sun.media.jfxmediaimpl.HostUtils;

class Node {

    int data;
    Node nextNode;

    public Node(int data, Node nextNode) {
        this.data = data;
        this.nextNode = nextNode;

    }


}

class LinkedList2 {

    Node head;


    public LinkedList2(Node head) {
       this.head = head;

    }

    public boolean isEmpty() {
        if (this.head == null) {
            return true;


        } else {
            return false;
        }

    }

    public void add(int data) {
        Node newNode = new Node(data, null);
        if (head == null) {
            head = newNode;
        } else {
            Node cur = head;
            while (cur.nextNode != null) {
                cur = cur.nextNode;
            }
            cur.nextNode = newNode;

        }


    }

    public void remove(int data) {
        if (isEmpty() == false) {
            Node cur = head;
            Node prev = cur;
            while (cur != null) {
                if (cur.data == data) {
                    prev.nextNode = cur.nextNode;
                    break;

                }
                prev = cur;

                cur = cur.nextNode;


            }


        }

    }
    public void show(){
        Node cur = head;
        System.out.println();
        while(cur != null){
            System.out.print(cur.data+"\n");
            cur = cur.nextNode;


        }
    }


}


public class Main {
    public static void main(String[] args) {

        LinkedList2 l1 =new LinkedList2(new Node(1,null));
        l1.show();



    }

}