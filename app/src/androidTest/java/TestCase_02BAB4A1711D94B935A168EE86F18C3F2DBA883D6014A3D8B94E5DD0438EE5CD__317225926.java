import android.app.Activity;
import android.view.MenuInflater;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_02BAB4A1711D94B935A168EE86F18C3F2DBA883D6014A3D8B94E5DD0438EE5CD__317225926 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      MenuInflater var3 = var2.getMenuInflater();
   }

   public TestCase_02BAB4A1711D94B935A168EE86F18C3F2DBA883D6014A3D8B94E5DD0438EE5CD__317225926() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
