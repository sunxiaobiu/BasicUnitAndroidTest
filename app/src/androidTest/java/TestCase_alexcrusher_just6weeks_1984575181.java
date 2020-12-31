import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_alexcrusher_just6weeks_1984575181 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      Object var1 = EasyMock.createMock(MotionEvent.class);
      MotionEventCompat.findPointerIndex((MotionEvent)var1, var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
