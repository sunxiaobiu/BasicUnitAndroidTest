import android.app.Activity;
import android.support.design.widget.TextInputEditText;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airmap_airmap_146628834 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = new ActivityTestRule(Activity.class);
      Activity var3 = var2.getActivity();
      TextInputEditText var1 = new TextInputEditText(var3);
      var1.setSingleLine();
   }
}
