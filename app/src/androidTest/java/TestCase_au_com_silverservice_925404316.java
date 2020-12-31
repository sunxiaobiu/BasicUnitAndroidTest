import android.content.Context;
import android.hardware.input.InputManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_silverservice_925404316 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("input");
      InputManager var4 = (InputManager)var3;
      byte var1 = 1;
      var4.getInputDevice(var1);
   }
}
