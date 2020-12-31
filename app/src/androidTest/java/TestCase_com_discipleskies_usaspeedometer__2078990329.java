import android.location.LocationManager;
import android.location.GpsStatus.NmeaListener;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_discipleskies_usaspeedometer__2078990329 {
   @Test
   public void testCase() throws Exception {
      MyService var2 = new MyService();
      Object var3 = var2.getSystemService("location");
      LocationManager var4 = (LocationManager)var3;
      Object var1 = null;
      var4.removeNmeaListener((NmeaListener)var1);
   }
}
