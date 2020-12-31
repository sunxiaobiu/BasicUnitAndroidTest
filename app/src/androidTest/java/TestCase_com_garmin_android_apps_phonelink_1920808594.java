import android.location.LocationManager;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_garmin_android_apps_phonelink_1920808594 {
   @Test
   public void testCase() throws Exception {
      MyService var1 = new MyService();
      Object var2 = var1.getSystemService("location");
      LocationManager var3 = (LocationManager)var2;
      var3.removeTestProvider("network");
   }
}
