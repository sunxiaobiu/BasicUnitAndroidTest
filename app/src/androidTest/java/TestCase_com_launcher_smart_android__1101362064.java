import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_launcher_smart_android__1101362064 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var7 = this.mActivityRule;
      Activity var8 = var7.getActivity();
      Object var1 = EasyMock.createMock(IntentSender.class);
      byte var2 = 1;
      Object var3 = EasyMock.createMock(Intent.class);
      byte var4 = 1;
      byte var5 = 1;
      byte var6 = 1;
      var8.startIntentSenderForResult((IntentSender)var1, var2, (Intent)var3, var4, var5, var6, (Bundle)null);
   }

   public TestCase_com_launcher_smart_android__1101362064() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
