import android.app.Activity;
import android.view.MotionEvent;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abc_kids_preschool_learning_phonics_songs_videos_535718417 {
   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = new ActivityTestRule(Activity.class);
      Activity var3 = var2.getActivity();
      Object var1 = EasyMock.createMock(MotionEvent.class);
      var3.dispatchTouchEvent((MotionEvent)var1);
   }
}
