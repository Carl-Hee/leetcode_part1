class Solutions {
  
  public List<String> possibleMoves(String s) {
    List<String> result = new ArrayList<String>();
    for( int i = 1; i < s.length(); i++ ) {       //从下标为1开始遍历， 避免(i-1<0)的异常
      if ( s.charAt(i) == '+' && s.charAt(i-1) == '+' ) {
        result.add ( s.substring(0,i-1) + '--' + s.substring(i+1, s.length());
      }
    }
    return result; 
  }
}
