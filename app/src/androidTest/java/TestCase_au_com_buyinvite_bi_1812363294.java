import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_buyinvite_bi_1812363294 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = new ActivityTestRule(Activity.class);
      Activity var2 = var1.getActivity();
      FragmentManager var3 = var2.getFragmentManager();
      FragmentTransaction var4 = var3.beginTransaction();
      var4.commitNow();
   }
}
