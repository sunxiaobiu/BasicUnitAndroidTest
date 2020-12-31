import android.os.PatternMatcher;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_188365932282C3154EEBCC1C5295C02275906F37959AB9C70C1907B1CE2A9A60__1448097969 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(int.class);
      byte var4 = 0;
      Object var1 = EasyMock.createMock(String.class);
      var1 = EasyMock.createMock(String.class);
      PatternMatcher var2 = new PatternMatcher((String)var1, var4);
      boolean var5 = var2.match((String)var1);
   }
}
