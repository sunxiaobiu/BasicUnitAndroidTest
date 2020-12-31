import android.app.Activity;
import android.support.v7.widget.ListViewCompat;
import android.view.View;
import android.widget.ListAdapter;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bamnetworks_mobile_android_gameday_milb_1215789543 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      View var4 = var3.findViewById(2131624086);
      ListViewCompat var5 = (ListViewCompat)var4;
      Object var1 = null;
      var5.setAdapter((ListAdapter)var1);
   }

   public TestCase_com_bamnetworks_mobile_android_gameday_milb_1215789543() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
