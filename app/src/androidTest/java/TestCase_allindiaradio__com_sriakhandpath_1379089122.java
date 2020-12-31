import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_allindiaradio__com_sriakhandpath_1379089122 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(MotionEvent.class);
      int var1 = MotionEventCompat.getActionMasked((MotionEvent)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
