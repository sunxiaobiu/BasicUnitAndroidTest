import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_maildroid__1545584169 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(PackageManager.class);
      String var1 = "android";
      byte var2 = 1;
      ((PackageManager)var3).getDrawable(var1, var2, (ApplicationInfo)null);
   }
}
