import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abc_kids_preschool_learning_phonics_songs_videos__1779253200 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = this.mActivityRule;
      Activity var4 = var3.getActivity();
      FragmentManager var5 = var4.getFragmentManager();
      FragmentTransaction var6 = var5.beginTransaction();
      byte var1 = 1;
      Object var2 = null;
      var6.add(var1, (Fragment)var2, "SAVideoTag");
   }

   public TestCase_abc_kids_preschool_learning_phonics_songs_videos__1779253200() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
