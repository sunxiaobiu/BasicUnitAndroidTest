import android.app.UiModeManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_appsontoast_ultimatecardock__331235038 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(UiModeManager.class);
      ((UiModeManager)var1).disableCarMode(0);
   }
}
