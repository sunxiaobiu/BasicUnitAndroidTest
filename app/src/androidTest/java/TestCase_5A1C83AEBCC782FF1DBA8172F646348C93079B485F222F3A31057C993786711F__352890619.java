import android.app.Activity;
import android.app.KeyguardManager;
import android.app.KeyguardManager.KeyguardLock;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A1C83AEBCC782FF1DBA8172F646348C93079B485F222F3A31057C993786711F__352890619 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      Object var3 = var2.getSystemService("keyguard");
      KeyguardManager var4 = (KeyguardManager)var3;
      KeyguardLock var5 = var4.newKeyguardLock("MyKeyguardLock");
      var5.disableKeyguard();
   }

   public TestCase_5A1C83AEBCC782FF1DBA8172F646348C93079B485F222F3A31057C993786711F__352890619() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
