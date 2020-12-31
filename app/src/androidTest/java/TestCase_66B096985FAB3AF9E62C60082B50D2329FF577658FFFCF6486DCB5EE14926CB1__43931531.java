import android.content.Context;
import android.drm.DrmManagerClient;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_66B096985FAB3AF9E62C60082B50D2329FF577658FFFCF6486DCB5EE14926CB1__43931531 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      DrmManagerClient var2 = new DrmManagerClient(var1);
      String var3 = "android";
      var2.openConvertSession(var3);
   }
}
