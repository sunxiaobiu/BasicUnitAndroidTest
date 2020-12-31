import android.net.http.HttpResponseCache;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_fullersystems_cribbage_22909151 {
   @Test
   public void testCase() throws Exception {
      HttpResponseCache var3 = HttpResponseCache.getInstalled();
      long var1 = var3.size();
   }
}
