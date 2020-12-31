import android.content.ContentResolver;
import android.provider.Settings.Secure;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_gears42_surelock__726519508 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ContentResolver.class);
      boolean var1 = true;
      Secure.setLocationProviderEnabled((ContentResolver)var0, "network", var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
