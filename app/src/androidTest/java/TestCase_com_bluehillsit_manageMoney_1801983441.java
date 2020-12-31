import android.icu.text.DecimalFormat;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bluehillsit_manageMoney_1801983441 {
   @Test
   public void testCase() throws Exception {
      DecimalFormat var3 = new DecimalFormat(".##");
      double var1 = 1.0D;
      var3.format(var1);
   }
}
