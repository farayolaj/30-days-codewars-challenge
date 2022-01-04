public class HexToRGB {
  
  public static int[] hexStringToRGB(String hex) {
    
    int r = Integer.parseInt(hex.substring(1, 3), 16);
    int g = Integer.parseInt(hex.substring(3, 5), 16);
    int b = Integer.parseInt(hex.substring(5, 7), 16);
    
    return new int[] {r, g, b};
  }
  
}
