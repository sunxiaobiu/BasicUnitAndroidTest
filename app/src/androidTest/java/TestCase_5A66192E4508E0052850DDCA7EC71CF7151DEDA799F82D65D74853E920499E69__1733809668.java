import android.util.LruCache;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A66192E4508E0052850DDCA7EC71CF7151DEDA799F82D65D74853E920499E69__1733809668 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(LruCache.class);
      String var1 = "android";
      ((LruCache)var2).remove(var1);
   }
}
