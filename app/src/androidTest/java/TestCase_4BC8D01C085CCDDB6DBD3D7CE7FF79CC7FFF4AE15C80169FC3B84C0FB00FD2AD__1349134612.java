import android.app.Activity;
import androidx.core.app.TaskStackBuilder;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_4BC8D01C085CCDDB6DBD3D7CE7FF79CC7FFF4AE15C80169FC3B84C0FB00FD2AD__1349134612 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      TaskStackBuilder var3 = TaskStackBuilder.create(var2);
      var3.startActivities();
   }

   public TestCase_4BC8D01C085CCDDB6DBD3D7CE7FF79CC7FFF4AE15C80169FC3B84C0FB00FD2AD__1349134612() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
