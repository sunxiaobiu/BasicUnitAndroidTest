import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_dcpetitions_mobile_iphone__1188226843 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = new ActivityTestRule(Activity.class);
      Activity var2 = var1.getActivity();
      Intent var3 = var2.getIntent();
      Bundle var4 = var3.getBundleExtra("pushBundle");
   }
}
