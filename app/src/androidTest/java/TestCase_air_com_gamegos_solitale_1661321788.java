import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.Resources.Theme;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_com_gamegos_solitale_1661321788 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Context var4 = var3.getBaseContext();
      Theme var5 = var4.getTheme();
      int[] var1 = new int[1];
      TypedArray var6 = var5.obtainStyledAttributes(var1);
      float var7 = var6.getDimension(0, 0.0F);
   }

   public TestCase_air_com_gamegos_solitale_1661321788() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
