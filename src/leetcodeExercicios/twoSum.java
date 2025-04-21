package leetcodeExercicios;

public class twoSum {
    /**
     * Definition for singly-linked list.
     * public class leetcodeExercicios.ListNode {
     *     int val;
     *     leetcodeExercicios.ListNode next;
     *     leetcodeExercicios.ListNode() {}
     *     leetcodeExercicios.ListNode(int val) { this.val = val; }
     *     leetcodeExercicios.ListNode(int val, leetcodeExercicios.ListNode next) { this.val = val; this.next = next; }
     * }
     */
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {


            return addWithCariet(l1,l2,0);

        }

        protected static ListNode addWithCariet(ListNode l1, ListNode l2, int cariet) {
            if (l1 == null && l2 == null) {
                if (cariet == 0)
                    return null;
                return new ListNode(cariet, null);
            }

            ListNode nextL1 = null, nextL2 = null;
            int val1 = 0, val2 = 0;

            if (l1 != null) {
                nextL1 = l1.next;
                val1 = l1.val;
            }
            if (l2 != null) {
                nextL2 = l2.next;
                val2 = l2.val;
            }

            int res = val1 + val2 + cariet;
            cariet = 0;

            if (res > 9) {
                cariet = 1;
                res -= 10;
            }

            return new ListNode(res, addWithCariet(nextL1, nextL2, cariet));
        }
    }


}
