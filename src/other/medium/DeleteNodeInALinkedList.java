package other.medium;

import utils.linkedlist.ListNode;

/**
 * Problem: 237. Delete Node in a Linked List
 * Difficulty: Medium
 * Link: https://leetcode.com/problemsdelete-node-in-a-linked-list
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class DeleteNodeInALinkedList {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}