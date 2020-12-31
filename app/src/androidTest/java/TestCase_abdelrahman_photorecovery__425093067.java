import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery__425093067 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Object var1 = null;
      Object var2 = EasyMock.createMock(IntentFilter.class);
      var3.registerReceiver((BroadcastReceiver)var1, (IntentFilter)var2);
   }
}
