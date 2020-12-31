import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5997CA36C31CAA68B33B8238A822E7BFA82E3A405EF116ADFF70DA2F98F11BBE_909400210 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("display");
      DisplayManager var3 = (DisplayManager)var2;
      Display[] var4 = var3.getDisplays();
   }
}
