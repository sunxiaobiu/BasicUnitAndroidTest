import android.net.Uri;
import android.net.Uri.Builder;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_carsguide_1437086705 {
   @Test
   public void testCase() throws Exception {
      StringBuilder var1 = new StringBuilder();
      String var2 = var1.toString();
      Uri var3 = Uri.parse(var2);
      Builder var4 = var3.buildUpon();
      var4.clearQuery();
   }
}
