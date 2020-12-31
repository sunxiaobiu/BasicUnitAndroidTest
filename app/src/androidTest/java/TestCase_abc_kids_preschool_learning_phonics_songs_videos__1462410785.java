import android.app.Activity;
import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import java.util.Locale;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abc_kids_preschool_learning_phonics_songs_videos__1462410785 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Resources var4 = var3.getResources();
      Configuration var5 = var4.getConfiguration();
      Object var1 = null;
      var5.setLayoutDirection((Locale)var1);
   }

   public TestCase_abc_kids_preschool_learning_phonics_songs_videos__1462410785() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
