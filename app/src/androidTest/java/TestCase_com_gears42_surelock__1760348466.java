import android.content.ContentResolver;
import android.provider.Settings.Secure;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_gears42_surelock__1760348466 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ContentResolver.class);
      byte var1 = 1;
      Secure.putInt((ContentResolver)var0, "location_mode", var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
