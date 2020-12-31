import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_gears42_surelock_323560980 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(DevicePolicyManager.class);
      Object var1 = EasyMock.createMock(ComponentName.class);
      ((DevicePolicyManager)var2).clearUserRestriction((ComponentName)var1, "no_install_unknown_sources");
   }
}
