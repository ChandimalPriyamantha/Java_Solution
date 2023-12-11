public class Solution {
 
  // Node class to represent each element in the linked list
  static class Node {
    
    int data;
    Node next;

    Node(int data) {
       
     this.data = data;
     this.next = null;
       
    }

  }

  // LinkedList class with basic operations
   static class LinkedList{

      Node head;
      
      // Method to add a new node to the end of the list
      void addNode(int data) {
          Node newNode = new Node(data);


          if(head == null) {

             head = newNode;
 
          }else {
              Node current = head;
              while (current.next != null) {
                  current = current.next; 
              }
               current.next = newNode;

          }


     }
    // Method to display the elements of the linked list
    void displayList() {
      
       Node current = head;
       while (current != null) {
         System.out.print(current.data + " ");
         current = current.next;

       }

        System.out.println();

    }

   }

public static void main(String[] args) {
    LinkedList myList = new LinkedList();

    // Adding elemnts to the linked list

    myList.addNode(1);
    myList.addNode(2);
    myList.addNode(3);

   // Displaying the linked list
   System.out.print("Linkrf List");
   myList.displayList();

}

}