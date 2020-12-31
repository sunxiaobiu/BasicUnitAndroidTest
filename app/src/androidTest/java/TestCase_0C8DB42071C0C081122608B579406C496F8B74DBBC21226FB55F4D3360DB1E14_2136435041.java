import android.view.MotionEvent;
import androidx.core.view.MotionEventCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0C8DB42071C0C081122608B579406C496F8B74DBBC21226FB55F4D3360DB1E14_2136435041 {
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
