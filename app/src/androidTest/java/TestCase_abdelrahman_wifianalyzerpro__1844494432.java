import android.content.ContentResolver;
import android.provider.Settings.Secure;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_wifianalyzerpro__1844494432 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(ContentResolver.class);
      int var1 = Secure.getInt((ContentResolver)var0, "location_mode");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
