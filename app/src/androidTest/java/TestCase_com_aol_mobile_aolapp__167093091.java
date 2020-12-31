import android.content.Context;
import android.net.Uri;
import android.support.v7.app.NotificationCompat.Builder;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_aol_mobile_aolapp__167093091 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Builder var2 = new Builder(var1);
      Object var3 = EasyMock.createMock(Uri.class);
      var2.setSound((Uri)var3);
   }
}
