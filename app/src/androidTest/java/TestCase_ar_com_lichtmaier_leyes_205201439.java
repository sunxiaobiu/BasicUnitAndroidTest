import android.app.Activity;
import android.content.pm.ShortcutManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ar_com_lichtmaier_leyes_205201439 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      Object var3 = var2.getSystemService(ShortcutManager.class);
      ShortcutManager var4 = (ShortcutManager)var3;
      List var5 = var4.getDynamicShortcuts();
   }

   public TestCase_ar_com_lichtmaier_leyes_205201439() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
