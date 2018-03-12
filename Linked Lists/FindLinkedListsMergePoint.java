package com.learn.hr;

/**
 * 
 * @author Kamal Bindra
 * 
 *         Find Merge Point of Two Lists
 */
public class FindLinkedListsMergePoint {
	public static void main(String[] args) {
		FindLinkedListsMergePoint.Node<Integer> headA = new FindLinkedListsMergePoint.Node<Integer>(1);
		headA.next = new FindLinkedListsMergePoint.Node<Integer>(2);
		headA.next.next = new FindLinkedListsMergePoint.Node<Integer>(3);
		headA.next.next.next = new FindLinkedListsMergePoint.Node<Integer>(4);
		headA.next.next.next.next = new FindLinkedListsMergePoint.Node<Integer>(5);

		FindLinkedListsMergePoint.Node<Integer> headB = new FindLinkedListsMergePoint.Node<Integer>(11);
		headB.next = new FindLinkedListsMergePoint.Node<Integer>(22);
		headB.next.next = new FindLinkedListsMergePoint.Node<Integer>(33);
		headB.next.next.next = headA.next.next.next;
		int result = findMergeNode(headA, headB);
		System.out.println(result);
	}

	public static int findMergeNode(Node<Integer> headA, Node<Integer> headB) {
		Node<Integer> curHeadA = headA;
		Node<Integer> curHeadB = headB;
		while (curHeadA != curHeadB) {
			if (curHeadA == null) {
				curHeadA = headB;
			} else {
				curHeadA = curHeadA.getNext();
			}

			if (curHeadB == null) {
				curHeadB = headA;
			} else {
				curHeadB = curHeadB.getNext();
			}
		}
		return curHeadA.getData();
	}

	public static class Node<T> {
		private T data;
		private Node<T> next;

		Node(T data) {
			this.data = data;
			this.next = null;
		}

		public T getData() {
			return data;
		}

		public Node<T> getNext() {
			return next;
		}
	}
}
