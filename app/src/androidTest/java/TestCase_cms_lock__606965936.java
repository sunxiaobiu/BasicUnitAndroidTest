import android.app.usage.UsageEvents.Event;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_cms_lock__606965936 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Event.class);
      String var2 = ((Event)var1).getPackageName();
   }
}
