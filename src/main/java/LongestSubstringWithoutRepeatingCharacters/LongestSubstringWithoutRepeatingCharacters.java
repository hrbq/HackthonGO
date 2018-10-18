package LongestSubstringWithoutRepeatingCharacters;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args){

        String t1 = "";
        int ans = 0;


        t1 = "abcabcbb";
        ans = lengthOfLongestSubstring(t1);
        System.out.println("max length is  " + ans +" the answer is 3");

        t1 = "abcdabcbb";
        ans = lengthOfLongestSubstring(t1);
        System.out.println("max length is  " + ans +" the answer is 4");

        t1 = "abbabcbb";
        ans = lengthOfLongestSubstring(t1);
        System.out.println("max length is  " + ans +" the answer is 3");

        t1 = "bbbbbbbb";
        ans = lengthOfLongestSubstring(t1);
        System.out.println("max length is  " + ans +" the answer is 1");

        t1 = "pwwkew";
        ans = lengthOfLongestSubstring(t1);
        System.out.println("max length is  " + ans +" the answer is 3");

        t1 = " ";
        ans = lengthOfLongestSubstring(t1);
        System.out.println("max length is  " + ans +" the answer is 1");

        t1 = "au";
        ans = lengthOfLongestSubstring(t1);
        System.out.println("max length is  " + ans +" the answer is 2");

        t1 = "aab";
        ans = lengthOfLongestSubstring(t1);
        System.out.println("max length is  " + ans +" the answer is 2");

        t1 = "dvdf";
        ans = lengthOfLongestSubstring(t1);
        System.out.println("max length is  " + ans +" the answer is 3");

    }

    public static int lengthOfLongestSubstring(String s) {

        String rs = "";

        int curMaxLen = 0;
        int f = 0;
        int sl = s.length();
        int rslen = 0;

        char[] chars = s.toCharArray();

        for(int i = 0 ; i < sl ; i++) {
            char c = chars[i];
            if( rs.indexOf(c) >= 0){
                i = f++;
                rs = "";
                rslen = 0;
            }else{
                rs = rs.concat(String.valueOf(c));
                ++rslen;
                if(rslen > curMaxLen) {
                    curMaxLen = rslen;
                }
                if( i  >= sl - 1){
                    break;
                }
            }
        }
        return curMaxLen;
    }
}
