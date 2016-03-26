/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
// 将输入时间区间放入两个数组，对数组进行排序，比较相邻位置元素看是否存在重叠

public class Solutions {

  public boolean meetingRoom(Intervals[] interval) {
    int len = interval.length;
    
    int[] start = new int[len];
    int[] end = new int[len];
    for ( int i = 0; i< len; i++ ) {
      start[i] = interval[i].start;
      end[i] = interval[i].stop;
      }
    Arrays.sort(start);
    Arrays.sort(end);
    
    for ( int i = 1; i < len; i++) {      //一定要考虑边界条件， 如果数组长度仅为1，那么arr[1]就报错了！
      if ( start[i] < end[i-1] ) {
        return false;
        }
    }
  return true;
  }
}
