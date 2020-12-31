import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Parcelable;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_gov_humanservices_authenticator_release__43626308 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var4 = this.mActivityRule;
      Activity var5 = var4.getActivity();
      Intent var1 = var5.getIntent();
      StringBuilder var2 = new StringBuilder();
      String var6 = var2.toString();
      Parcelable var7 = var1.getParcelableExtra(var6);
      PendingIntent var8 = (PendingIntent)var7;
      byte var3 = 1;
      var8.send(var5, var3, var1);
   }

   public TestCase_au_gov_humanservices_authenticator_release__43626308() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
