import android.text.format.DateUtils;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_03AA2E47862E91C338355045A863AC1F1AA336A8039B0D488004AE7E9E993801_617670894 {
   public static void testCase() throws Exception {
      long var1 = 1L;
      long var3 = 1L;
      DateUtils.getRelativeTimeSpanString(var1, var3, 60000L);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
