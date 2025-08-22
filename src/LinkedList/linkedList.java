package LinkedList;

//public class linkedList {
//    Node head;
//
//    static class Node{
//        int data;
//        Node next;
//        Node(int d){
//            data = d;
//            next = null;
//        }
//    }
//    public void insert(int data){
//        Node newNode = new Node(data);
//        if(head == null){
//            head = newNode;
//            return;
//        }
//        Node last = head;
//        while(last.next != null){
//            last = last.next;
//        }
//        last.next = newNode;
//    }
//
//    public void displayList(){
//        Node temp = head;
//        while(temp != null){
//            System.out.print(temp.data+"->");
//            temp = temp.next;
//        }
//        System.out.println("null");
//    }
//    public static void main(String[] args) {
//        linkedList list = new linkedList();
//        list.insert(3);
//        list.insert(4);
//        list.insert(5);
//        list.insert(6);
//        list.displayList();
//    }
//}


class linkedlist{
    static public class Node{
        int data;
        Node next;

        Node(int data){
            this.data =  data;
            next = null;
        }

    }
    public static void main(String[] args) {
        Node newNode = new Node(10);
        Node newNode1 = new Node(20);

        newNode.next = newNode1;

        System.out.println(newNode.data);

        System.out.println(newNode.next);
        System.out.println(newNode1);

        System.out.println(newNode.next.data);
        System.out.println(newNode1.data);

    }
}
