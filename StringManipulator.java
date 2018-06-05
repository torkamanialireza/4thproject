public class StringManipulator{
  public String trimAndConcat(String a,String b){
    String aTrim = a.trim();
    String bTrim = b.trim();
    String concat =  aTrim.concat(bTrim);
    return concat;
  }
}
