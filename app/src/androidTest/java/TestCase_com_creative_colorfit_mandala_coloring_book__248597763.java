import android.net.http.HttpResponseCache;
import androidx.test.runner.AndroidJUnit4;
import java.net.URI;
import java.util.Map;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_creative_colorfit_mandala_coloring_book__248597763 {
   @Test
   public void testCase() throws Exception {
      HttpResponseCache var2 = HttpResponseCache.getInstalled();
      Object var1 = null;
      var2.get((URI)var1, "GET", (Map)null);
   }
}
