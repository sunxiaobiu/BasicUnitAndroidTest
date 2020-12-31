import android.app.Activity;
import android.support.v7.widget.LinearLayoutManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_appfreeislamic_AbdulbasitwithEnglishMp3_1068030703 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      LinearLayoutManager var1 = new LinearLayoutManager(var3);
      int var4 = var1.findFirstCompletelyVisibleItemPosition();
   }

   public TestCase_ae_appfreeislamic_AbdulbasitwithEnglishMp3_1068030703() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
