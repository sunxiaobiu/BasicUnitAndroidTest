import android.support.v4.util.LruCache;
import androidx.test.runner.AndroidJUnit4;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_alibaba_aliexpress_itao__1880382816 {
   @Test
   public void testCase() throws Exception {
      LruCache var1 = new LruCache(20);
      Map var2 = var1.snapshot();
   }
}
