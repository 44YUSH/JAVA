class Solution {
    public String addBinary(String a, String b) {
        int x = a.length();
        int y = b.length();
        int max = Math.max(x, y);
        int c = 0;

        StringBuilder sb = new StringBuilder();

        int i = 0;
        while(i < max || c > 0){
            int A = i < x ? a.charAt(x - 1 - i) - '0' : 0;
            int B = i < y ? b.charAt(y - 1 - i) - '0' : 0;

            int S = (A ^ B) ^ c;
            int c_out = ((A ^ B) & c) | (A & B);

            sb.append((char)(S + '0'));
            c = c_out;

            i++;
        }

        return sb.reverse().toString();
    }
}