import android.app.Activity;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AlertDialog.Builder;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aachen_rwth_de_flapp_189119063 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Builder var1 = new Builder(var3);
      AlertDialog var4 = var1.create();
   }

   public TestCase_aachen_rwth_de_flapp_189119063() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
