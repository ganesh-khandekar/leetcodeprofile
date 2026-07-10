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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null){
            return null;
        }
        int sum=0,flag=0,carry=0;
        if(l1!=null&&l2!=null){
            if((l1.val+l2.val)>9){
                if(l1.next!=null){
                    l1.next.val = l1.next.val+(l1.val+l2.val)/10;
                }else if(l2.next!=null){
                l2.next.val = l2.next.val+(l1.val+l2.val)/10;
                }
                sum=(l1.val+l2.val)%10;
                carry=(l1.val+l2.val)/10;
                flag=1;
            }else{
                sum= (l1.val+l2.val);
            }
        }else if(l1!=null){
            if((l1.val)>9){
                if(l1.next!=null){
                    l1.next.val = l1.next.val+(l1.val)/10;
                }
                sum=(l1.val)%10;
                carry=(l1.val)/10;
                flag=1;
            }else{
                sum= (l1.val);
            }
        }else if(l2!=null){
            if((l2.val)>9){
                if(l2.next!=null){
                    l2.next.val = l2.next.val+(l2.val)/10;
                }
                sum=(l2.val)%10;
                carry=(l2.val)/10;
                flag=1;
            }else{
                sum= (l2.val);
            }
        }  
        if(l1!=null){
            l1=l1.next;
        }    
        if(l2!=null){
            l2=l2.next;
        }
        if(l1==null&&l2==null&&flag!=0){
            l1 = new ListNode(carry,null);
        }
                
        return new ListNode(sum,addTwoNumbers(l1,l2));
    }
}