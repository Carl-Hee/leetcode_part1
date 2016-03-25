public class Solution {
  
  public int majorityNumber(int[] nums) {
      HashMap<Integer, Integer> mMap = new HashMap<Integer, Integer>();
        for (int i:nums) {
          Integer temp = mMap.put(i,1);          //如果不存在键i则返回null，否则返回被覆盖的值
          if ( temp != null ) {
            mMap.put(i, temp+1);                 //键i存在，并且累加1
            }
        }
        
      Map.Entry<Integer, Integer> n = null;
      Iterator<Map.Entry<Integer,Integer>> itr = mMap.entrySet().iterator();    //HashMap自身没实现Iterable接口，需要通过entrySet()过渡
      int tt = 0;
      while ( itr.hasNext() ) {
        Map.Entry<Integer, Integer> m = itr.next();
        int val = m.getValue();
        if ( tt <= val ) {
            tt = val;
            n = m;
        }
      }
      
      return n.getKey();
  }
}    
