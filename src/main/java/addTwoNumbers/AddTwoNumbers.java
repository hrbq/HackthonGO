package addTwoNumbers;

import java.util.Arrays;
import java.util.Stack;

public class AddTwoNumbers {

/*
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 */
    public static void main(String[] args) {

        ListNode l1 = null;
        ListNode l2 = null;
        ListNode result = null;


        //test case1
         l1 = new ListNode(2); l1.next = new ListNode(4); l1.next.next = new ListNode(3);
         l2 = new ListNode(5); l2.next = new ListNode(6); l2.next.next = new ListNode(4);
         result = addTwoNumbers(l1,l2);
       // showAnswer(result);

        //test case2
         l1 = new ListNode(0);
         l2 = new ListNode(9); l2.next = new ListNode(1); l2.next.next = new ListNode(6);
         result = addTwoNumbers(l1,l2);
       // showAnswer(result);

         //test case3
        l1 = new ListNode(9); l1.next = new ListNode(9); l1.next.next = new ListNode(9);
        l2 = new ListNode(1);
        result = addTwoNumbers(l1,l2);
      //  showAnswer(result);




    }

    private static void showAnswer(ListNode l3) {
        System.out.println("Show answer");

        Stack<Integer> stack = new Stack<Integer>();

        while( l3 != null) {

            stack.push(l3.val);

            if(l3.next == null) {
                break;
            }

            l3 = l3.next;

        }

        System.out.println(Arrays.toString(stack.toArray()));
        System.out.println("end test.....................");
        System.out.println("");
        System.out.println("");


    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode fNode = null;
        ListNode currentNdoe = null;

        int a = 0; //sums with each node
        int b = 0; //a single digits
        int c = 0; //carry numbers
        int accIdx = 0;// loop times

        while ( l1 != null || l2 != null){

            accIdx++;
            a = ((l1 == null ) ? 0 : l1.val) +  ((l2 == null) ? 0 :  l2.val) + c;
            b = a % 10;
            c = a / 10;

         //   System.out.println("a total sum -> " + a + ", b is mode result-> " + b + " , c is carry number-> " +c );

            //remember first node.
            if(accIdx == 1){
                currentNdoe = new ListNode(b);
                fNode = currentNdoe;
            }else{
                currentNdoe.next  = new ListNode(b);
                currentNdoe = currentNdoe.next;
            }

            l1 = (l1 != null ) ? l1.next : null;
            l2 = (l2 != null ) ? l2.next : null;

            if( l1 == null && l2 == null) {
                currentNdoe.next  = new ListNode(c);
                currentNdoe = currentNdoe.next;
//                System.out.println("end of two inputs listNodes");
                break;
            }

        }

        return fNode;
    }
}
