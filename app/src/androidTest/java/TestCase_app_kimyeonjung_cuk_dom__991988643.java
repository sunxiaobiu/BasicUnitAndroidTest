import android.support.v4.view.ViewConfigurationCompat;
import android.view.ViewConfiguration;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_kimyeonjung_cuk_dom__991988643 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ViewConfiguration.class);
      int var1 = ViewConfigurationCompat.getScaledPagingTouchSlop((ViewConfiguration)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
