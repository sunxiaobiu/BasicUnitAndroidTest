import android.app.PendingIntent;
import android.content.Context;
import android.location.LocationManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A2064FD1EBA4AD0E4375A58CC14726A62232B824C23AB78A86EB577CDB89622__1872956156 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("location");
      LocationManager var4 = (LocationManager)var3;
      Object var1 = EasyMock.createMock(PendingIntent.class);
      var4.removeUpdates((PendingIntent)var1);
   }
}
