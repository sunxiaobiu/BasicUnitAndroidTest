import android.app.Activity;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_arproductions_andrew_expenselog_175703935 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = new ActivityTestRule(Activity.class);
      Activity var3 = var2.getActivity();
      AppCompatActivity var4 = (AppCompatActivity)var3;
      FragmentManager var5 = var4.getSupportFragmentManager();
      FragmentTransaction var6 = var5.beginTransaction();
      Object var1 = EasyMock.createMock(Fragment.class);
      var6.detach((Fragment)var1);
   }
}
