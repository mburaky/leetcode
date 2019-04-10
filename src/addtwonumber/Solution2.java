package addtwonumber;

public class Solution2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode result = null;

        long sumValue = listNodeIntValue(l1) + listNodeIntValue(l2);
        System.out.println(sumValue);

        if(sumValue == 0){
         result = new ListNode((int)sumValue);
        }
        else {
            while (sumValue != 0) {
                int val = (int)(sumValue % 10);
                result = insert(result, val);
                sumValue = sumValue / 10;
            }
        }
        return result;
    }

    private long listNodeIntValue(ListNode ln){
        long i = 1;
        long listNodeIntValue = 0;
        while (ln != null) {
            listNodeIntValue = listNodeIntValue + ln.val * i;
            i = i * 10;
            ln = ln.next;
        }
        return listNodeIntValue;
    }

    private ListNode insert(ListNode head, int val){
        ListNode newNode = new ListNode(val);
        if(head == null){
            head = newNode;
        }
        else{
            ListNode lastNode = head;
            while(lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        return head;
    }
}
