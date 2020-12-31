import android.support.v4.view.VelocityTrackerCompat;
import android.view.VelocityTracker;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_kimyeonjung_cuk_dom__822601625 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(VelocityTracker.class);
      byte var1 = 1;
      VelocityTrackerCompat.getXVelocity((VelocityTracker)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
