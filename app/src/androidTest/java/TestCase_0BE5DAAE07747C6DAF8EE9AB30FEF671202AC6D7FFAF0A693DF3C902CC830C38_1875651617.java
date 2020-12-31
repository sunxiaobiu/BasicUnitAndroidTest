import android.app.Activity;
import android.content.DialogInterface.OnClickListener;
import androidx.appcompat.app.AlertDialog.Builder;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0BE5DAAE07747C6DAF8EE9AB30FEF671202AC6D7FFAF0A693DF3C902CC830C38_1875651617 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = this.mActivityRule;
      Activity var1 = var3.getActivity();
      Builder var4 = new Builder(var1);
      String var5 = "android";
      Object var2 = null;
      var4.setNeutralButton(var5, (OnClickListener)var2);
   }

   public TestCase_0BE5DAAE07747C6DAF8EE9AB30FEF671202AC6D7FFAF0A693DF3C902CC830C38_1875651617() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
