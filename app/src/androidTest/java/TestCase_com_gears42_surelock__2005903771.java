import android.app.admin.DevicePolicyManager;
import android.content.ComponentName;
import android.net.ProxyInfo;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_gears42_surelock__2005903771 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(DevicePolicyManager.class);
      Object var1 = EasyMock.createMock(ComponentName.class);
      Object var2 = EasyMock.createMock(ProxyInfo.class);
      ((DevicePolicyManager)var3).setRecommendedGlobalProxy((ComponentName)var1, (ProxyInfo)var2);
   }
}
