import android.net.Uri;
import android.provider.Settings.Secure;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_asus_filemanager_384559564 {
   public static void testCase() throws Exception {
      Uri var0 = Secure.getUriFor("asus_analytics");
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
