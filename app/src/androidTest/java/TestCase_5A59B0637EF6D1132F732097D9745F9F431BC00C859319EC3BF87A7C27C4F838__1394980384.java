import android.app.Activity;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AlertDialog.Builder;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A59B0637EF6D1132F732097D9745F9F431BC00C859319EC3BF87A7C27C4F838__1394980384 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Builder var1 = new Builder(var3, 2131755413);
      AlertDialog var4 = var1.create();
      Object var5 = EasyMock.createMock(View.class);
      var4.setView((View)var5, 0, 0, 0, 0);
   }

   public TestCase_5A59B0637EF6D1132F732097D9745F9F431BC00C859319EC3BF87A7C27C4F838__1394980384() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
