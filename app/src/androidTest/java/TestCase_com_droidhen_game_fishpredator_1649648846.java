import android.app.Activity;
import android.hardware.SensorListener;
import android.hardware.SensorManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_droidhen_game_fishpredator_1649648846 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Object var4 = var3.getSystemService("sensor");
      SensorManager var5 = (SensorManager)var4;
      Object var1 = null;
      var5.registerListener((SensorListener)var1, 2, 1);
   }

   public TestCase_com_droidhen_game_fishpredator_1649648846() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
