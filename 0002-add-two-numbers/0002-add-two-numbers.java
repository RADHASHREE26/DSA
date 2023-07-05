/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode list1, ListNode list2) {

        int sum=0, carry=0;
        
        ListNode dummy=new ListNode(0,null);
        ListNode temp=dummy;
        
        while(list1!=null || list2!=null || carry!=0)
        {
            sum=0;
            if(list1!=null)
            {
                sum+=list1.val;
                list1=list1.next;
            }
            
            if(list2!=null)
            {
                sum+=list2.val;
                list2=list2.next;
            }
            
            sum+=carry;
            ListNode n=new ListNode(sum%10);
            temp.next=n;
            temp=temp.next;
            
            carry=sum/10;
            
        }
        
        return dummy.next;
        
    }
}

/*

int sum=0, carry=0;

        ListNode dummy = new ListNode();
        ListNode temp = dummy;

        while(l1!=null || l2!=null || carry!=0)
        {
            sum=0;
            if(l1!=null)
            sum+=l1.val;
            if(l2!=null)
            sum+=l2.val;
            sum+=carry;

            ListNode n=new ListNode(sum%10);
            temp.next=n;

            carry=sum/10;

            if(l1!=null)
            l1=l1.next;
            if(l2!=null)
            l2=l2.next;
            temp=temp.next;
            
        }
        return dummy.next;
        
        */