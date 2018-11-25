public class Solution {
    /*
     * @param dictionary: an array of strings
     * @return: an arraylist of strings
     */
    public List<String> longestWords(String[] dictionary) {
        // write your code here
        if (dictionary == null) {
            return null;
        }
        
        // 遍历两遍
        
        // int max = dictionary[0].length();
        
        // for (int i = 0; i < dictionary.length; ++i) {
        //     if (dictionary[i].length() > max) {
        //         max = dictionary[i].length();
        //     }
        // }
        
        // List<String> list = new ArrayList<>();
        
        // for (int i = 0; i < dictionary.length; ++i) {
        //     if (dictionary[i].length() == max) {
        //         list.add(dictionary[i]);
        //     }
        // }
        
        // return list;
        
        // 遍历一遍
        List<String> list = new ArrayList<>();
        int max = dictionary[0].length();
        
        for (int i = 0; i < dictionary.length; ++i) {
            if (dictionary[i].length() > max) {
                max = dictionary[i].length();
                list.clear();
                list.add(dictionary[i]);
            } else if (dictionary[i].length() == max) {
                list.add(dictionary[i]);
            }
        }
        
        return list;
    }
}