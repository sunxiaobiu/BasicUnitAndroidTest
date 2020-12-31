import android.app.Activity;
import android.support.v7.app.AlertDialog.Builder;
import android.view.View;
import android.widget.TextView;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_zem_scanarplus__612315404 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var1 = var2.getActivity();
      Builder var3 = new Builder(var1, 2131230889);
      Object var4 = EasyMock.createMock(TextView.class);
      var3.setCustomTitle((View)var4);
   }

   public TestCase_ch_zem_scanarplus__612315404() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
