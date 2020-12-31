import android.app.Activity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_gov_humanservices_authenticator_release_383889814 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = this.mActivityRule;
      Activity var2 = var1.getActivity();
      View var3 = View.inflate(var2, 2130903069, (ViewGroup)null);
      LinearLayout var4 = (LinearLayout)var3;
      var3 = var4.findViewById(2131427434);
      Toolbar var5 = (Toolbar)var3;
      var5.setTitle(2131558422);
   }

   public TestCase_au_gov_humanservices_authenticator_release_383889814() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
