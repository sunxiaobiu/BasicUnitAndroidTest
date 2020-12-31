import android.content.BroadcastReceiver;
import android.content.ContextWrapper;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aachen_rwth_de_flapp_1366630625 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ContextWrapper.class);
      Object var1 = EasyMock.createMock(BroadcastReceiver.class);
      ((ContextWrapper)var2).unregisterReceiver((BroadcastReceiver)var1);
   }
}
