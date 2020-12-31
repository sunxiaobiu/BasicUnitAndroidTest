import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.test.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import java.io.File;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_au_gov_qld_deta_takeastand_1103611570 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Context var4 = InstrumentationRegistry.getTargetContext();
      ContextWrapper var1 = new ContextWrapper(var4);
      File var5 = var1.getCacheDir();
   }

   public TestCase_air_au_gov_qld_deta_takeastand_1103611570() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
