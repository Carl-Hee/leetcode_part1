class Solutioins {
  public List<String> possibleMoves(String s) {
    List<String> result = new ArrayList<String>();    //List初始化
    
    for(int i = 0; i< s.length()-1; i++ ) {
      char[] toChar = s.toCharArray();                //String转字符数组
     
      if ( s.charAt(i) == '+' && s.charAt(i+1) == '+' ) {
        toChar[i] = toChar[i+1] = '-';
        result.add(String.valueOf(toChar));            //char[] 转成String
        }
    }
    return result;
  }
}
