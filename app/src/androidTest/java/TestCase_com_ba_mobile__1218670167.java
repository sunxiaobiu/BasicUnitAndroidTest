import android.icu.util.TimeZone;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_ba_mobile__1218670167 {
   @Test
   public void testCase() throws Exception {
      TimeZone var1 = TimeZone.getDefault();
      String var2 = var1.getDisplayName(true, 0);
   }
}
