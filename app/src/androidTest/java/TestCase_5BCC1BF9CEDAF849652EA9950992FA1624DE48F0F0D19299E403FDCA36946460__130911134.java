import android.app.Activity;
import android.app.ProgressDialog;
import android.content.DialogInterface.OnClickListener;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5BCC1BF9CEDAF849652EA9950992FA1624DE48F0F0D19299E403FDCA36946460__130911134 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = new ActivityTestRule(Activity.class);
      Activity var3 = var2.getActivity();
      ProgressDialog var4 = new ProgressDialog(var3);
      Object var1 = null;
      var4.setButton("Cancel", (OnClickListener)var1);
   }
}
