import android.net.http.HttpResponseCache;
import androidx.test.runner.AndroidJUnit4;
import java.net.ResponseCache;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_fullersystems_cribbage_621533736 {
   @Test
   public void testCase() throws Exception {
      ResponseCache var1 = ResponseCache.getDefault();
      HttpResponseCache var2 = (HttpResponseCache)var1;
      var2.delete();
   }
}
