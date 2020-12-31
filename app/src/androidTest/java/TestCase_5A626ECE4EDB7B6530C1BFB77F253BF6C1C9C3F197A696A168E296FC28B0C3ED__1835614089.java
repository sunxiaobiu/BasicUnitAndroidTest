import android.app.Activity;
import android.hardware.SensorListener;
import android.hardware.SensorManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A626ECE4EDB7B6530C1BFB77F253BF6C1C9C3F197A696A168E296FC28B0C3ED__1835614089 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Object var4 = var3.getSystemService("sensor");
      SensorManager var5 = (SensorManager)var4;
      Object var1 = EasyMock.createMock(SensorListener.class);
      var5.unregisterListener((SensorListener)var1);
   }

   public TestCase_5A626ECE4EDB7B6530C1BFB77F253BF6C1C9C3F197A696A168E296FC28B0C3ED__1835614089() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
