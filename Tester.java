import java.util.Arrays;
import java.util.Random;

public class Tester {
   public static void main(String[] args) {

      MineField mf = new MineField(8,6,10);
      mf.printAll();
      mf.populateMineField(mf.numRows(), mf.numCols());
      mf.printAll();
      // int[][] a = new int[10][10];
      // for(int i = 0; i < a.length; i ++) {
      //    Arrays.fill(a[i], -1);
      // }
      
   }
}
