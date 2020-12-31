import android.app.Activity;
import android.content.Context;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_2C44AEC328DFDA6B10DB5EDDF4731045C8D88320C24AE654BDF973012D2D6156__1500857518 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Context var4 = (Context)var3;
      DrawerArrowDrawable var1 = new DrawerArrowDrawable(var4);
      var1.setAlpha(255);
   }

   public TestCase_2C44AEC328DFDA6B10DB5EDDF4731045C8D88320C24AE654BDF973012D2D6156__1500857518() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
