public class Solution {
    /**
     * @param originalString: a string
     * @return: a compressed string
     */
    public String compress(String originalString) {
        // write your code here
        if (originalString == null || originalString.length() <= 1) {
            return originalString;
        }

        char tmp = originalString.charAt(0);
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < originalString.length(); ++i) {
            if (originalString.charAt(i) == originalString.charAt(i - 1)) {
                ++count;
            } else {
                sb.append(tmp);
                sb.append(count);
                tmp = originalString.charAt(i);
                count = 1;
            }
        }
        sb.append(tmp);
        sb.append(count);

        return sb.toString().length() < originalString.length() ? sb.toString() : originalString;
    }
}