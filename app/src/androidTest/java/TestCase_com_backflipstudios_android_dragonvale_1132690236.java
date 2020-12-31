import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import java.util.Iterator;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_backflipstudios_android_dragonvale_1132690236 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      Object var3 = var2.getSystemService("sensor");
      SensorManager var4 = (SensorManager)var3;
      List var5 = var4.getSensorList(-1);
      Iterator var6 = var5.iterator();
      var3 = var6.next();
      Sensor var7 = (Sensor)var3;
      String var8 = var7.toString();
   }

   public TestCase_com_backflipstudios_android_dragonvale_1132690236() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
