import android.app.Activity;
import android.app.Instrumentation.ActivityMonitor;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_asuk_com_android_app_540917038 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ActivityMonitor.class);
      Activity var2 = ((ActivityMonitor)var1).waitForActivity();
   }
}
