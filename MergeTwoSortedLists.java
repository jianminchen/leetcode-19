// Definition for singly-linked list.
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode mergedHead = null;
		ListNode mergedTail = null;
		while (l1 != null || l2 != null) {
			ListNode node;
			if (l1 != null && (l2 == null || l1.val < l2.val)) {
				node = l1;
				l1 = l1.next;
			} else {
				node = l2;
				l2 = l2.next;
			}
			node.next = null;
			if (mergedHead == null) {
				mergedHead = node;
			} else {
				mergedTail.next = node;
			}
			mergedTail = node;
		}
		return mergedHead;
	}
}
