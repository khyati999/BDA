
public class LinkedList 
{
    Node head;

    class Node 
    {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    LinkedList insert(LinkedList listAdd, int val) {
        Node newNode = new Node(val);
        if (listAdd.head == null) {
            listAdd.head = newNode;
        } else {
            Node temp = listAdd.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        System.out.println("Node Added: "+newNode.data);
        return listAdd;
    }

    public LinkedList insertAtPosition(LinkedList list, int pos, int val) {
        Node newNode = new Node(val);
        if (pos < 0) {
            System.out.println("Invalid Position");
        } else if (pos == 0) {
            newNode.next = list.head;
            list.head = newNode;
        } else {
            Node temp = list.head;
            for (int i = 0; i < pos - 1 && temp != null; i++) {
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Invalid Position");
            } else {
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }
        System.out.println("Node Added at Postion:" + pos);
        return list;
    }
    public LinkedList deleteAtPosition(LinkedList list, int pos)
    {
        if (list.head == null) {
            System.out.println("List is empty, nothing to delete.");
            return list;
        }

        if (pos < 0) {
            System.out.println("Invalid Position");
        } else if (pos == 0) {
            list.head = list.head.next;
        } else {
            Node temp = list.head;
            Node prev = null;
            for (int i = 0; i < pos && temp != null; i++) {
                prev = temp;
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Invalid Position");
            } else {
                prev.next = temp.next;
            }
        }
        return list;
    }
    public LinkedList deleteByvalue(LinkedList list, int val)
    {
        Node temp = list.head;
        Node prev = null;
        if (temp != null && temp.data == val) {
            list.head = temp.next;
            return list;
        }
        while (temp != null && temp.data != val) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value not found in the list.");
            return list;
        }
        prev.next = temp.next;
        System.out.println("Value found in the list and deleted.");
        return list;
    }
    public void printList(LinkedList list)
    {
        Node temp=list.head;
        if(temp==null)
            System.out.println("No linkedlist to print");
        System.out.println(" Linkedlist:");
        while(temp!=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list = list.insert(list, 1);
        list = list.insert(list, 2);
        list = list.insert(list, 3);
        list.insertAtPosition(list, 3, 8);
        list.printList(list);
        list.deleteAtPosition(list,2);
        list.deleteByvalue(list,9);
        list.printList(list);     
    }
}