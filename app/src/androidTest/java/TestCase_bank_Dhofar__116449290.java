import android.app.Activity;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_bank_Dhofar__116449290 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      LocalBroadcastManager var4 = LocalBroadcastManager.getInstance(var3);
      Object var1 = EasyMock.createMock(Intent.class);
      var4.sendBroadcastSync((Intent)var1);
   }

   public TestCase_bank_Dhofar__116449290() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
