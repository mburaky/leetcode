public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);

        while (l1 != null || l2 != null){

            int tempVal = 0;
            if(l1 != null && l2 != null){
                tempVal = result.val + l1.val + l2.val;
                l1 = l1.next;
                l2 = l2.next;

            }

            if(l1 != null && l2 == null){
                tempVal = result.val + l1.val;
                l1 = l1.next;

            }

            if(l1 == null && l2 != null){
                tempVal = result.val + l2.val;
                l2 = l2.next;
            }


            if(tempVal > 10){
                result = new ListNode(tempVal % 10);
                result.next = new ListNode(1);
            }
            else{
                result = new ListNode(tempVal);
                result.next = new ListNode(0);
            }
            result = result.next;
        }

        return result;
    }
}
