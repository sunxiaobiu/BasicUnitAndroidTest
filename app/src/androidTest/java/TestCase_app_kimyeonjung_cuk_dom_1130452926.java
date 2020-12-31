import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_kimyeonjung_cuk_dom_1130452926 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(MotionEvent.class);
      byte var1 = 1;
      MotionEventCompat.getY((MotionEvent)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
