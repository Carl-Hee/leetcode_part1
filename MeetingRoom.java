class Solutions {
  
  public boolean meetingRoom(Interval[] intervals) {
      HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
      boolean result = true;
      
      for ( int i = 0; i < intervals.length; i++ ) {
        int start = intervals[i].start;
        int end = intervals[i].end;
        for ( int m = start; m < end; m++ ) {
          Integer back = map.put(m,1);
          if ( back != null ) {
            return false;
          }
        }
      }
    return result;
  }
}
