import android.app.UiModeManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_599EE470C87E0152647041BD942DD2BE275F1CE2232E556A7D8F7D90256B4239__1196872070 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService(UiModeManager.class);
      UiModeManager var3 = (UiModeManager)var2;
      int var4 = var3.getNightMode();
   }
}
