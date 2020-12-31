import android.content.pm.PackageManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery__1817350874 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(PackageManager.class);
      String var1 = "android";
      String var2 = "android";
      ((PackageManager)var3).checkPermission(var1, var2);
   }
}
