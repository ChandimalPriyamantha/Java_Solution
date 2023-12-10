import java.util.LinkedList;
import java.util.Collections;

class Solution {

  public listNode mergeTwoLists(ListNode list1, ListNode list2){
        
      // Dammy Node
      var node = new ListNode(0);
      var head = node;

      while(list1 != null || list2 != null){
      // Take node for list1 
          if(list2 == null || (list1 != null && list1.val < list2.val )){
                   node.next = list1;
                   list1 = list1.next;
          }else{
             // Take node for list2
             node.next = list2;
             list2 = list2.next;

          }
          node = node.next;
       return head.next;
     
      }

      

     
  }

  public static void main(String[], args){

  
  }

}