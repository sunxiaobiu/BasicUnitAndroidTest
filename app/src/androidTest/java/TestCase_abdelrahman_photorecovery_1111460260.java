import android.net.Uri;
import android.net.Uri.Builder;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery_1111460260 {
   @Test
   public void testCase() throws Exception {
      Uri var2 = Uri.parse("market://details");
      Builder var3 = var2.buildUpon();
      String var1 = "android";
      var3.appendQueryParameter("id", var1);
   }
}
