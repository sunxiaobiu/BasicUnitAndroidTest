import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59A9BD625B8CD06FB2577A17DECDF2945B12E6726B4558F6D109D0E1A2992EC2_743139010 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      PackageManager var3 = var2.getPackageManager();
      Object var1 = EasyMock.createMock(ComponentName.class);
      var3.getProviderInfo((ComponentName)var1, 65536);
   }
}
