import android.net.http.HttpResponseCache;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_fullersystems_cribbage_682145898 {
   @Test
   public void testCase() throws Exception {
      HttpResponseCache var1 = HttpResponseCache.getInstalled();
      int var2 = var1.getHitCount();
   }
}
