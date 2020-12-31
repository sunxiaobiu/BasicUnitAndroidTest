import android.app.Activity;
import android.net.Uri;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_14C404C9C1E97A72ACA7F5F608A715BC4DBE3D2903FDDA0FF057ED4C7C42CF14_709728417 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var1 = new ActivityTestRule(Activity.class);
      Activity var2 = var1.getActivity();
      Uri var3 = var2.getReferrer();
   }
}
