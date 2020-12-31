import android.app.PendingIntent;
import android.app.Notification.Builder;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_dcpetitions_mobile_iphone__825359596 {
   @Test
   public void testCase() throws Exception {
      Context var4 = InstrumentationRegistry.getTargetContext();
      Builder var1 = new Builder(var4);
      Builder var5 = var1;
      byte var6 = 1;
      Object var2 = null;
      Object var3 = EasyMock.createMock(PendingIntent.class);
      var5.addAction(var6, (CharSequence)var2, (PendingIntent)var3);
   }
}
