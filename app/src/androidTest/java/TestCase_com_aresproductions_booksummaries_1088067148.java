import android.app.Activity;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.support.graphics.drawable.VectorDrawableCompat;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_aresproductions_booksummaries_1088067148 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var1 = var2.getActivity();
      Theme var3 = var1.getTheme();
      Resources var5 = var1.getResources();
      VectorDrawableCompat var4 = VectorDrawableCompat.create(var5, 2131230862, var3);
      byte var6 = 1;
      var4.setTint(var6);
   }

   public TestCase_com_aresproductions_booksummaries_1088067148() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
