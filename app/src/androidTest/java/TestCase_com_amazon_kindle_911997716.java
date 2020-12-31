import android.content.Context;
import android.drm.DrmManagerClient;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_amazon_kindle_911997716 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      DrmManagerClient var2 = new DrmManagerClient(var1);
      String var3 = "android";
      var2.canHandle(var3, (String)null);
   }
}
