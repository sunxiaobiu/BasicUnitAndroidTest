import android.os.Bundle;
import android.os.IBinder;
import androidx.core.app.BundleCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_60620D8134BC17E97006CBDC05A37185542A4934653D97592E8809792A42C1D1_106921065 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Bundle.class);
      BundleCompat.putBinder((Bundle)var0, "android.support.customtabs.extra.SESSION", (IBinder)null);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
