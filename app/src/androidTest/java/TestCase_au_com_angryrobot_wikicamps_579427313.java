import android.net.UrlQuerySanitizer;
import android.net.UrlQuerySanitizer.ValueSanitizer;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_angryrobot_wikicamps_579427313 {
   public static void testCase() throws Exception {
      ValueSanitizer var0 = UrlQuerySanitizer.getAllButNulLegal();
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
