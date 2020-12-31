import android.app.Activity;
import android.gesture.GestureOverlayView;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_ark_flipper__975651841 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = new ActivityTestRule(Activity.class);
      Activity var3 = var2.getActivity();
      GestureOverlayView var1 = new GestureOverlayView(var3);
      var1.setGestureVisible(false);
   }
}
