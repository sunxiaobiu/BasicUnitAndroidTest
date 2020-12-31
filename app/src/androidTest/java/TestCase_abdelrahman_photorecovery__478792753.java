import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery__478792753 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(NameNotFoundException.class);
      Log.wtf("GooglePlayServicesUtil", "This should never happen.", (Throwable)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
