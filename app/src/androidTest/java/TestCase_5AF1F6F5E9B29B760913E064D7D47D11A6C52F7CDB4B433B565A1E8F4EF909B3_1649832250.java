import android.app.Activity;
import android.net.Uri;
import androidx.core.app.ActivityCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5AF1F6F5E9B29B760913E064D7D47D11A6C52F7CDB4B433B565A1E8F4EF909B3_1649832250 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Activity.class);
      Uri var1 = ActivityCompat.getReferrer((Activity)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
