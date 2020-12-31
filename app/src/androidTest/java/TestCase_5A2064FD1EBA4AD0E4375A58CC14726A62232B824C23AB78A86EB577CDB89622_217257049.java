import android.app.PendingIntent;
import android.content.Context;
import android.location.LocationManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A2064FD1EBA4AD0E4375A58CC14726A62232B824C23AB78A86EB577CDB89622_217257049 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Object var4 = var3.getSystemService("location");
      LocationManager var5 = (LocationManager)var4;
      float var1 = 1.0F;
      Object var2 = EasyMock.createMock(PendingIntent.class);
      var5.requestLocationUpdates("passive", 3600000L, var1, (PendingIntent)var2);
   }
}
