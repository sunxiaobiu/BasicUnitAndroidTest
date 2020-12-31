import android.net.http.HttpResponseCache;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_hotdoc_android_generalpracticeplus__1014241495 {
   @Test
   public void testCase() throws Exception {
      HttpResponseCache var1 = HttpResponseCache.getInstalled();
      var1.flush();
   }
}
