import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.os.PowerManager.WakeLock;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_be_rbfa__1562720853 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("power");
      PowerManager var4 = (PowerManager)var3;
      WakeLock var5 = var4.newWakeLock(1, "Analytics WakeLock");
      Object var1 = EasyMock.createMock(WorkSource.class);
      var5.setWorkSource((WorkSource)var1);
   }
}
