import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ar_gob_inta_imargenes__2132326398 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      View var3 = var2.findViewById(2131558533);
      RecyclerView var4 = (RecyclerView)var3;
      var4.setAlpha(0.0F);
   }

   public TestCase_ar_gob_inta_imargenes__2132326398() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
