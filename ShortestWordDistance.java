public class Solution {
  
  public int shortestDistance( String[] words, String word1, String word2) {
      int distance1 = words.length;
      int distance2 = words.length;
      int tmp1 = tmp2 = 0;
      ArrayList<Integer> arr = new ArrayList<Integer>();
      
      for ( int i = 0; i < words.length; i++ ) {
          if ( word1.equals(words[i]) ) {      //比较两个字符串是否相等，用equals
              arr.add(i);
            }
      }
      
      for( int m: arr) {
        
        for ( int i = 0; i< words.length; i++ ) {
            if ( word2.equals(word[i]) ) {
              tmp1 = Math.abs(m - i);
              
              if ( tmp1 < distance1 ) {
                distance1 = tmp1;
              }
            }
        }
        tmp2 = distance1;
        if ( tmp2 < distance2 ) {
          distance2 = tmp2;
        }
    }    
    return distance2;
}
