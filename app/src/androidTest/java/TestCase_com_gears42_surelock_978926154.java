import android.app.Instrumentation;
import android.view.MotionEvent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_gears42_surelock_978926154 {
   @Test
   public void testCase() throws Exception {
      Instrumentation var2 = new Instrumentation();
      Object var1 = EasyMock.createMock(MotionEvent.class);
      var2.sendPointerSync((MotionEvent)var1);
   }
}
