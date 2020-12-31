import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import androidx.core.app.TaskStackBuilder;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0E8A815FFBF44567AB8C2DC559AE304F5B4C14AAAE2B15219ACEB78B6C0BBB8F_605688241 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      Context var3 = (Context)var2;
      TaskStackBuilder var4 = TaskStackBuilder.create(var3);
      PendingIntent var5 = var4.getPendingIntent(0, 134217728);
   }

   public TestCase_0E8A815FFBF44567AB8C2DC559AE304F5B4C14AAAE2B15219ACEB78B6C0BBB8F_605688241() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
