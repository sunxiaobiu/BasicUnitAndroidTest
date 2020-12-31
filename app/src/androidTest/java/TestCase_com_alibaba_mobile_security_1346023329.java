import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_alibaba_mobile_security_1346023329 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ApplicationInfo.class);
      Object var1 = EasyMock.createMock(PackageManager.class);
      ((ApplicationInfo)var2).loadDescription((PackageManager)var1);
   }
}
