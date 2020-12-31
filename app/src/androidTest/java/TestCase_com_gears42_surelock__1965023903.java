import android.app.Instrumentation;
import android.view.KeyEvent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_gears42_surelock__1965023903 {
   @Test
   public void testCase() throws Exception {
      Instrumentation var2 = new Instrumentation();
      Object var1 = EasyMock.createMock(KeyEvent.class);
      var2.sendKeySync((KeyEvent)var1);
   }
}
