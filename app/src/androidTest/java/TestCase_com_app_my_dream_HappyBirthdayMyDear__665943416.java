import android.app.Activity;
import android.net.Uri;
import android.support.v4.app.ShareCompat.IntentBuilder;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_app_my_dream_HappyBirthdayMyDear__665943416 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      IntentBuilder var4 = IntentBuilder.from(var3);
      Object var1 = EasyMock.createMock(Uri.class);
      var4.addStream((Uri)var1);
   }

   public TestCase_com_app_my_dream_HappyBirthdayMyDear__665943416() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
