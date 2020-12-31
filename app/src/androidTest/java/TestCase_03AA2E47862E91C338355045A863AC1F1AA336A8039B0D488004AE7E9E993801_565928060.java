import android.content.Context;
import androidx.core.app.NotificationCompat.Builder;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_03AA2E47862E91C338355045A863AC1F1AA336A8039B0D488004AE7E9E993801_565928060 {
   @Test
   public void testCase() throws Exception {
      Object var4 = EasyMock.createMock(String.class);
      Context var1 = InstrumentationRegistry.getTargetContext();
      Builder var2 = new Builder(var1, (String)var4);
      Builder var5 = var2;
      byte var6 = 1;
      byte var7 = 1;
      boolean var3 = true;
      var5.setProgress(var6, var7, var3);
   }
}
