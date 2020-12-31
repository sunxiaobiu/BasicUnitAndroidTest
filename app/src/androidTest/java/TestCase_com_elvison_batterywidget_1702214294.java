import android.app.IntentService;
import android.app.PendingIntent;
import android.location.Criteria;
import android.location.LocationManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_elvison_batterywidget_1702214294 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(IntentService.class);
      var3 = ((IntentService)var3).getSystemService("location");
      LocationManager var4 = (LocationManager)var3;
      Object var1 = EasyMock.createMock(Criteria.class);
      Object var2 = EasyMock.createMock(PendingIntent.class);
      var4.requestLocationUpdates(300000L, 0.0F, (Criteria)var1, (PendingIntent)var2);
   }
}
