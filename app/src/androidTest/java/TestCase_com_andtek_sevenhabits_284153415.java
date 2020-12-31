import android.app.Activity;
import android.support.design.widget.BottomSheetBehavior;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_andtek_sevenhabits_284153415 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      View var3 = var2.findViewById(2131296552);
      RelativeLayout var4 = (RelativeLayout)var3;
      var3 = (View)var4;
      BottomSheetBehavior var5 = BottomSheetBehavior.from(var3);
      var5.setSkipCollapsed(true);
   }

   public TestCase_com_andtek_sevenhabits_284153415() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
