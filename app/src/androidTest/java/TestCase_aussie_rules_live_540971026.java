import android.app.Activity;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.SharedElementCallback;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aussie_rules_live_540971026 {
   public static void testCase() throws Exception {
      Object var0 = null;
      Object var1 = EasyMock.createMock(SharedElementCallback.class);
      ActivityCompat.setEnterSharedElementCallback((Activity)var0, (SharedElementCallback)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
