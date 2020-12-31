import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.TaskStackBuilder;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0E8A815FFBF44567AB8C2DC559AE304F5B4C14AAAE2B15219ACEB78B6C0BBB8F__974568465 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Context var4 = (Context)var3;
      TaskStackBuilder var5 = TaskStackBuilder.create(var4);
      Object var1 = EasyMock.createMock(Intent.class);
      var5.addNextIntentWithParentStack((Intent)var1);
   }

   public TestCase_0E8A815FFBF44567AB8C2DC559AE304F5B4C14AAAE2B15219ACEB78B6C0BBB8F__974568465() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
