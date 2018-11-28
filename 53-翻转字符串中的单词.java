public class Solution {
    /*
     * @param s: A string
     * @return: A string
     */
    public String reverseWords(String s) {
        // write your code here
        if (s == null) {
            return null;
        }
        if (s.trim().equals("")) {
            return "";
        }
        String[] array = s.split(" ");

        Stack<String> stack = new Stack<>();
        for (String str : array) {
            stack.push(str);
        }
        StringBuilder sb = new StringBuilder();
        String result;

        while (!stack.isEmpty()) {
            String tmp = stack.pop();
            if (!tmp.equals("")) {
                sb.append(tmp).append(" ");
            }
        }
        result = sb.substring(0, sb.length() - 1);

        return result;
    }
}