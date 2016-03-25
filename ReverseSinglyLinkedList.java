class Solution {
  public ListNode reverseList( ListNode head) {
    if ( head == null || head.next == null ) {
      return head;
    }
    ListNode tmp = null;
    ListNode pivot = head;
    while ( pivot !=null && pivot.next !=null ) {
      tmp = pivot.next;
      pivot.next = pivot.next.next;
      tmp.next = pivot;
      head = tmp;
    }
    return head; 
  }
}
      
