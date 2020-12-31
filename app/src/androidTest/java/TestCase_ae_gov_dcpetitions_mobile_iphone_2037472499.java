import android.app.PendingIntent;
import android.app.Notification.Builder;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_dcpetitions_mobile_iphone_2037472499 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Builder var3 = new Builder(var1);
      Object var4 = EasyMock.createMock(PendingIntent.class);
      boolean var2 = true;
      var3.setFullScreenIntent((PendingIntent)var4, var2);
   }
}
