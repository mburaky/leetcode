package addtwonumber;

import addtwonumber.ListNode;

public class AddTwoNumbersSolution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = null;

        int tempVal = 0;
        while (l1 != null || l2 != null){

            if(l1 != null && l2 != null){
                tempVal = tempVal + l1.val + l2.val;
                if(tempVal >= 10){
                    result = insert(result, tempVal % 10);
                    tempVal = 1;
                }else{
                    result = insert(result, tempVal);
                    tempVal = 0;
                }
                l1 = l1.next;
                l2 = l2.next;
                continue;
            }

            if(l1 != null && l2 == null){
                tempVal = tempVal + l1.val;
                if(tempVal >= 10){
                    result = insert(result, tempVal % 10);
                    tempVal = 1;
                }else{
                    result = insert(result, tempVal);
                    tempVal = 0;
                }
                l1 = l1.next;
                continue;
            }

            if(l1 == null && l2 != null){
                tempVal = tempVal + l2.val;
                if(tempVal >= 10){
                    result = insert(result, tempVal % 10);
                    tempVal = 1;
                }else{
                    result = insert(result, tempVal);
                    tempVal = 0;
                }
                l2 = l2.next;
                continue;
            }
        }

        if(tempVal != 0){
            result = insert(result, tempVal);
        }

        return result;
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
