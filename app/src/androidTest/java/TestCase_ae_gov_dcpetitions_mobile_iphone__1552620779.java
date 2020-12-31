import android.app.Notification.Builder;
import android.content.Context;
import android.net.Uri;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_dcpetitions_mobile_iphone__1552620779 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Builder var3 = new Builder(var1);
      Object var4 = EasyMock.createMock(Uri.class);
      byte var2 = 1;
      var3.setSound((Uri)var4, var2);
   }
}
