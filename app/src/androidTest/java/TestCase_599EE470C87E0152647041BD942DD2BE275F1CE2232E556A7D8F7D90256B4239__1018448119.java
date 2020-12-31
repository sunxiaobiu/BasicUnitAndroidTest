import android.content.Context;
import android.os.PowerManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_599EE470C87E0152647041BD942DD2BE275F1CE2232E556A7D8F7D90256B4239__1018448119 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("power");
      PowerManager var3 = (PowerManager)var2;
      boolean var4 = var3.isPowerSaveMode();
   }
}
