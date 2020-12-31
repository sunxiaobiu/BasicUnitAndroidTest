import android.content.ComponentName;
import android.content.pm.PackageManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_tominven_vcfwt__54400877 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(PackageManager.class);
      Object var1 = EasyMock.createMock(ComponentName.class);
      ((PackageManager)var2).getResourcesForActivity((ComponentName)var1);
   }
}
