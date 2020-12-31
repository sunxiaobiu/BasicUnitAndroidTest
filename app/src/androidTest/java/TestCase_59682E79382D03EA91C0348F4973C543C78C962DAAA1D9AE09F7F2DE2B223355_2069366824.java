import android.app.Activity;
import android.view.KeyEvent;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59682E79382D03EA91C0348F4973C543C78C962DAAA1D9AE09F7F2DE2B223355_2069366824 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = this.mActivityRule;
      Activity var4 = var3.getActivity();
      byte var1 = 1;
      Object var2 = EasyMock.createMock(KeyEvent.class);
      var4.onKeyDown(var1, (KeyEvent)var2);
   }

   public TestCase_59682E79382D03EA91C0348F4973C543C78C962DAAA1D9AE09F7F2DE2B223355_2069366824() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
