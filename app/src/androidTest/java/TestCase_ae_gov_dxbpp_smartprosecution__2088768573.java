import android.app.PendingIntent;
import android.content.Context;
import android.location.Criteria;
import android.location.LocationManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_dxbpp_smartprosecution__2088768573 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Object var4 = var3.getSystemService("location");
      LocationManager var5 = (LocationManager)var4;
      Object var1 = EasyMock.createMock(Criteria.class);
      Object var2 = EasyMock.createMock(PendingIntent.class);
      var5.requestSingleUpdate((Criteria)var1, (PendingIntent)var2);
   }
}
