import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_arproductions_andrew_expenselog_438335540 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = new ActivityTestRule(Activity.class);
      Activity var2 = var1.getActivity();
      AppCompatActivity var3 = (AppCompatActivity)var2;
      FragmentManager var4 = var3.getSupportFragmentManager();
      Fragment var5 = var4.findFragmentById(2131689622);
      boolean var6 = var5.isVisible();
   }
}
