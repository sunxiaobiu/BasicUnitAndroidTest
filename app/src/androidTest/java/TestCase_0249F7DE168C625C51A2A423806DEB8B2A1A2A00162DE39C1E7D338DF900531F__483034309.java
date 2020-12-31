import android.app.Activity;
import android.app.KeyguardManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0249F7DE168C625C51A2A423806DEB8B2A1A2A00162DE39C1E7D338DF900531F__483034309 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      Object var3 = var2.getSystemService("keyguard");
      KeyguardManager var4 = (KeyguardManager)var3;
      boolean var5 = var4.isKeyguardLocked();
   }

   public TestCase_0249F7DE168C625C51A2A423806DEB8B2A1A2A00162DE39C1E7D338DF900531F__483034309() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
