import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_668066750AF2CB32A3E91408AC580B1B4ACB5CB319871AACC06E096384D58D06__757197195 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("display");
      DisplayManager var3 = (DisplayManager)var2;
      Display[] var4 = var3.getDisplays("com.samsung.android.hardware.display.category.DESKTOP");
   }
}
