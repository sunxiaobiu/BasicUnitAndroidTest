import android.net.UrlQuerySanitizer;
import android.net.UrlQuerySanitizer.ValueSanitizer;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_crowdcompass_appchefXcmPOF__2026384166 {
   @Test
   public void testCase() throws Exception {
      ValueSanitizer var2 = UrlQuerySanitizer.getUrlAndSpaceLegal();
      String var1 = "android";
      var2.sanitize(var1);
   }
}
