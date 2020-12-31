import android.text.format.DateUtils;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_gov_dhs_expressplus_lite_2069244913 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      String var1 = DateUtils.getMonthString(var0, 10);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
