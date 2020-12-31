import android.app.UiModeManager;
import androidx.test.runner.AndroidJUnit4;
import com.example.android.testing.unittesting.basicunitandroidtest.MyService;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_appsontoast_ultimatecardock_1506107079 {
   @Test
   public void testCase() throws Exception {
      MyService var1 = new MyService();
      Object var2 = var1.getSystemService("uimode");
      UiModeManager var3 = (UiModeManager)var2;
      var3.enableCarMode(0);
   }
}
