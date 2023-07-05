/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        int diff=difference(headA,headB);
        if(diff<0)
        {
            while(diff!=0)
            {
                headB=headB.next;
                diff++;
            }
        }
        else if(diff>0)
        {
            while(diff!=0)
            {
                headA=headA.next;
                diff--;
            }
        }
        while(headA!=null && headB!=null)
        {
            if(headA==headB)
                return headA;
            headA=headA.next;
            headB=headB.next;
        }
        
        return null;
        
    }
    
    public int difference(ListNode l1, ListNode l2)
    {
        int c1=0;
        int c2=0;
        
        while(l1!=null || l2!=null)
        {
            if(l1!=null)
            {
                c1++;
                l1=l1.next;
            }
            if(l2!=null)
            {
                c2++;
                l2=l2.next;
            }
        }
        
        return c1-c2;
    }
    
}