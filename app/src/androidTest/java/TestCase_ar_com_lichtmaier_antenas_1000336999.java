import android.app.ActivityManager;
import androidx.core.app.ActivityManagerCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ar_com_lichtmaier_antenas_1000336999 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ActivityManager.class);
      boolean var1 = ActivityManagerCompat.isLowRamDevice((ActivityManager)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
