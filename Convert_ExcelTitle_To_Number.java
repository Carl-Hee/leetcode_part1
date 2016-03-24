public class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        char a = 'A';
        for(int num = 1; num <= 26; a++,num++) {
            map.put(a,num);
        }
        char[] ch = s.toCharArray();
        int magn = 1;
        for ( int i = ch.length - 1; i >= 0 ; i-- ){
             result += map.get( ch[i] ) * magn;
             magn *= 26;
        }
        return result;
    }
}
