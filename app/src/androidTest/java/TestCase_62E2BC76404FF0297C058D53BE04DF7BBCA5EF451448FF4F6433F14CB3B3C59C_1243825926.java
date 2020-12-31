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
public class TestCase_62E2BC76404FF0297C058D53BE04DF7BBCA5EF451448FF4F6433F14CB3B3C59C_1243825926 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Object var1 = EasyMock.createMock(Intent.class);
      var3.startActivityForResult((Intent)var1, 7001);
   }

   public TestCase_62E2BC76404FF0297C058D53BE04DF7BBCA5EF451448FF4F6433F14CB3B3C59C_1243825926() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
