import android.content.ContentResolver;
import android.provider.Settings.Secure;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_fiberlink_maas360_android_control_samsung_379165470 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ContentResolver.class);
      boolean var1 = Secure.isLocationProviderEnabled((ContentResolver)var0, "network");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
