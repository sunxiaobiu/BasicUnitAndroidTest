import android.view.MotionEvent;
import androidx.core.view.MotionEventCompat;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0C8DB42071C0C081122608B579406C496F8B74DBBC21226FB55F4D3360DB1E14_1011603357 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(MotionEvent.class);
      byte var1 = 1;
      MotionEventCompat.getX((MotionEvent)var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
