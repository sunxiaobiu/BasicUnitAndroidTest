import android.app.Activity;
import android.content.IntentSender;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5ACAB7DFE19AC55FED77092725BB1F83F8A1A990DF4EAE1F9FE8D82332E09C62__1405966248 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Object var4 = var3.getSystemService(ShortcutManager.class);
      ShortcutManager var5 = (ShortcutManager)var4;
      Object var1 = EasyMock.createMock(ShortcutInfo.class);
      var5.requestPinShortcut((ShortcutInfo)var1, (IntentSender)null);
   }

   public TestCase_5ACAB7DFE19AC55FED77092725BB1F83F8A1A990DF4EAE1F9FE8D82332E09C62__1405966248() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
