import android.app.Activity;
import android.content.Intent;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_018050FA67BFA249436AE40583EBBAEFB1FB5F7B053D13ADA4F027C56676383C__2122545715 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Intent var4 = var3.getIntent();
      Object var1 = EasyMock.createMock(Intent.class);
      var4.filterEquals((Intent)var1);
   }

   public TestCase_018050FA67BFA249436AE40583EBBAEFB1FB5F7B053D13ADA4F027C56676383C__2122545715() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
