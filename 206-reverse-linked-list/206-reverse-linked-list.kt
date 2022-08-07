/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun reverseList(head: ListNode?): ListNode? {
        var previous: ListNode? = null
        var current: ListNode? = head
        while(current != null) {
            current.next = previous.also { previous = current?.next }
            current = previous.also { previous = current }
        }
        return previous
    }
}