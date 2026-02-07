class Solution {
    public int minimumDeletions(String s) {
        int bCount = 0;      // number of 'b's seen
        int deletions = 0;   // minimum deletions required

        for (char c : s.toCharArray()) {
            if (c == 'b') {
                bCount++;
            } else { // c == 'a'
                if (bCount > 0) {
                    deletions++;
                    bCount--; // delete one previous 'b'
                }
            }
        }

        return deletions;
    }
}