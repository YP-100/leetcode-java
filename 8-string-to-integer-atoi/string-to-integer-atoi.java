class Solution {
    public int myAtoi(String s) {
        String trimmeds = s.strip();

        if (trimmeds.length() == 0) {
            return 0;
        }
        int sum = 0;
        int sign = 1;
        int start = 0;
        if (trimmeds.charAt(0) == '-') {
            sign = -1;
            start = 1;
        } else if (trimmeds.charAt(0) == '+') {
            start = 1;
        }

        for (int i = start; i < trimmeds.length(); i++) {

            char ch = trimmeds.charAt(i);

            if (!Character.isDigit(ch)) {
                break;
            }

            int digit = ch - '0';

            if (sum > (Integer.MAX_VALUE - digit) / 10) {

                if (sign == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }

            sum = sum * 10 + digit;
        }

        return sum * sign;
    }
}