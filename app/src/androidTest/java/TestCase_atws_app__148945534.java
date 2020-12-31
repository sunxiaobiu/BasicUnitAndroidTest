import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_atws_app__148945534 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = new ActivityTestRule(Activity.class);
      Activity var2 = var1.getActivity();
      FragmentActivity var3 = (FragmentActivity)var2;
      FragmentManager var4 = var3.getSupportFragmentManager();
      List var5 = var4.getFragments();
      Iterator var6 = var5.iterator();
      Object var7 = var6.next();
      Fragment var8 = (Fragment)var7;
      int var9 = var8.getId();
   }
}
