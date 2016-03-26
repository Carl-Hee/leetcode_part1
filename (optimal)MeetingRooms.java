/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
 
 //自定义排序器，排序时直接进行判断，若抛异常则认为有重叠
 
 public class Solution {
  
  public boolean meetingRoom( Interval[] intervals) {
    try {
        Arrays.sort(intervals, new IntervalCompartor() );
      } catch ( Exception ex) {
        return false;
      }
    return true;
  }
  
  public class IntervalComparator implements Comparator<Interval> {
      public int compare( Interval a, Interval b) {
        if ( a.start > b.start && a.start >= b.end) {
          return 1; 
         } else if ( a.start < b.start && a.end <= b.start) {
          return -1;
        } 
        throw new RunTimeException();
      }
    }
    
  }
      
      
