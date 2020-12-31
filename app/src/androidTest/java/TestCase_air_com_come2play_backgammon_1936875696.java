import android.app.PendingIntent;
import android.location.LocationManager;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_com_come2play_backgammon_1936875696 {
   @Test
   public void testCase() throws Exception {
      MyService var7 = new MyService();
      Object var8 = var7.getSystemService("location");
      LocationManager var9 = (LocationManager)var8;
      double var1 = 1.0D;
      double var3 = 1.0D;
      float var5 = 1.0F;
      Object var6 = EasyMock.createMock(PendingIntent.class);
      var9.addProximityAlert(var1, var3, var5, -1L, (PendingIntent)var6);
   }
}
