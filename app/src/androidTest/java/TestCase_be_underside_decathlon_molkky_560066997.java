import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.DisplayManager.DisplayListener;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_be_underside_decathlon_molkky_560066997 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("display");
      DisplayManager var4 = (DisplayManager)var3;
      Object var1 = EasyMock.createMock(DisplayListener.class);
      var4.unregisterDisplayListener((DisplayListener)var1);
   }
}
