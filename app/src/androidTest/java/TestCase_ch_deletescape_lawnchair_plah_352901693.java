import android.content.Context;
import android.content.pm.PackageManager;
import android.os.UserHandle;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_deletescape_lawnchair_plah_352901693 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      PackageManager var4 = var3.getPackageManager();
      Object var1 = null;
      Object var2 = EasyMock.createMock(UserHandle.class);
      var4.getUserBadgedLabel((CharSequence)var1, (UserHandle)var2);
   }
}
