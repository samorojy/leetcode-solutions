/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun isValidBST(root: TreeNode?): Boolean 
            = checkNode(root, Long.MIN_VALUE, Long.MAX_VALUE)
            
    fun checkNode(node: TreeNode?, min: Long, max: Long): Boolean {
        if (node == null) return true
        if (node?.`val` <= min || node?.`val` >= max) return false
        return checkNode(node?.left, min, node?.`val`?.toLong()) &&                                                  checkNode(node?.right, node?.`val`?.toLong(), max)
    }
}