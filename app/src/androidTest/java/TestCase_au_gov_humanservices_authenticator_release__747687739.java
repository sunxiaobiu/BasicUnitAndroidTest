import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_gov_humanservices_authenticator_release__747687739 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = this.mActivityRule;
      Activity var4 = var3.getActivity();
      StringBuilder var1 = new StringBuilder();
      String var6 = var1.toString();
      Intent var2 = new Intent(var6, (Uri)null, var4, ActionBarActivity.class);
      char[] var5 = new char[1];
      var2.putExtra(var6, var5);
   }

   public TestCase_au_gov_humanservices_authenticator_release__747687739() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
