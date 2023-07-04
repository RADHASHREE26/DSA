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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        
        ListNode dummy=new ListNode(0,null);
        ListNode temp=dummy;
        ListNode prev=null;
        ListNode nex=null;
        
        if(list1.val<list2.val)
        {
            prev=list1;
            list1=list1.next;
        }
        else
        {
            prev=list2;
            list2=list2.next;
        }
        while(list1!=null && list2!=null)
        {
            if(list1.val<list2.val)
            {
                temp.next=prev;
                temp=prev;
                prev.next=list1;
                prev=prev.next;
                list1=list1.next;
            }
            else
            {
                temp.next=prev;
                temp=prev;
                prev.next=list2;
                prev=prev.next;
                list2=list2.next;
            }
        }
        if(list1!=null)
        {
            prev.next=list1;
            temp.next=prev;
        }
        if(list2!=null)
        {
            prev.next=list2;
            temp.next=prev;
        }
        return dummy.next;
        
        
    }
}


/*
EFFICIENT METHOD

if(list1==null)
        return list2;
        if(list2==null)
        return list1;
        
        ListNode d=new ListNode(0,null);
        ListNode temp=d;

        while(list1!=null && list2!=null)
        {
            if(list1.val<list2.val)
            {
                temp.next=list1;
                list1=list1.next;
            }
            else
            {
                temp.next=list2;
                list2=list2.next;
            }
            temp=temp.next;
        }
        if(list1!=null)
        {
            temp.next=list1;
        }
        if(list2!=null)
        {
            temp.next=list2;
        }
        return d.next;

*/



/* USING EXTRA SPACE
o(n1+n2)

ListNode d=new ListNode(0,null);
        ListNode dd=d;
        while(list1!=null && list2!=null)
        {
            if(list1.val<list2.val)
            {
                    ListNode n=new ListNode(list1.val,null);
                    list1=list1.next;
                    dd.next=n;
                    dd=n;
            }
            else
            {
                    ListNode n=new ListNode(list2.val,null);
                    list2=list2.next;
                    dd.next=n;
                    dd=n;
            }
        }
        while(list1!=null)
        {
            ListNode n=new ListNode(list1.val,null);
            list1=list1.next;
            dd.next=n;
            dd=n;
        }
        while(list2!=null)
        {
            ListNode n=new ListNode(list2.val,null);
            list2=list2.next;
            dd.next=n;
            dd=n;
        }
        return d.next;
        

        */


        /*if(list1.val<list2.val)
            {
                temp=list1;
                list1=list1.next;
            }
            else
            {
                temp.next=list2;
                ListNode n=list1;
                list1=list2;
                list2=n;
            }*/

/*

if (list1 == null && list2 == null) return null;
        if (list1 == null && list2 != null) return list2;
        if (list2 == null && list1 != null) return list1;
        
        ListNode i = list1, j = list2;
        
        ListNode head = null, tail = null;
        
        while (i != null && j != null) {
            
            if (i.val <= j.val) {
                
                if (head == null) {
                    
                    head = i;
                    tail = head;
                    
                }
                else {
                    
                    tail.next = i;
                    tail = tail.next;
                    
                }
                i = i.next;
                
            }
            else {
                
                if (head == null) {
                    
                    head = j;
                    tail = head;
                    
                }
                else {
                    
                    tail.next = j;
                    tail = tail.next;
                    
                }
                
                j = j.next;
                
            }
            
        }
        
        while (i != null) {
            
            tail.next = i;
            tail = tail.next;
            
            i = i.next;
            
        }

        while (j != null) {
            
            tail.next = j;
            tail = tail.next;
            
            j = j.next;
            
        }
        
        return head;
        
        */