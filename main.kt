class Solution {
    fun isPalindrome(x: Int): Boolean {
        val straight = x.toString().toCharArray()
        var reverse = CharArray(straight.size)
        for (i in straight.indices) {
            reverse[i] = straight[straight.size-1-i]
        }

        return reverse.contentEquals(straight)
    }
}