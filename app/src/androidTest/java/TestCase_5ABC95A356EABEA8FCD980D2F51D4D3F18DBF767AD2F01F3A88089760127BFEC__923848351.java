import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5ABC95A356EABEA8FCD980D2F51D4D3F18DBF767AD2F01F3A88089760127BFEC__923848351 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      Intent var3 = var2.getIntent();
      Rect var4 = var3.getSourceBounds();
   }

   public TestCase_5ABC95A356EABEA8FCD980D2F51D4D3F18DBF767AD2F01F3A88089760127BFEC__923848351() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
