import android.content.Context;
import android.hardware.input.InputManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_silverservice_1619053542 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("input");
      InputManager var3 = (InputManager)var2;
      int[] var4 = var3.getInputDeviceIds();
   }
}
