import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_shakthifm__145539549 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      PackageManager var3 = var2.getPackageManager();
      Object var1 = EasyMock.createMock(Intent.class);
      var3.queryIntentActivities((Intent)var1, 0);
   }
}
