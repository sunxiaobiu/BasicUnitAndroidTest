import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_appfreeislamic_AbdulbasitwithEnglishMp3_201921204 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      View var3 = var2.findViewById(2131296578);
      Toolbar var4 = (Toolbar)var3;
      Drawable var5 = var4.getOverflowIcon();
   }

   public TestCase_ae_appfreeislamic_AbdulbasitwithEnglishMp3_201921204() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
