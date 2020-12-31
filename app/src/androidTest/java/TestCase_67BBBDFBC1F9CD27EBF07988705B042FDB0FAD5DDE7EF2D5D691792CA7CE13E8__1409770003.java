import android.content.pm.PackageInstaller;
import android.content.pm.PackageInstaller.SessionCallback;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_67BBBDFBC1F9CD27EBF07988705B042FDB0FAD5DDE7EF2D5D691792CA7CE13E8__1409770003 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(PackageInstaller.class);
      Object var1 = EasyMock.createMock(SessionCallback.class);
      ((PackageInstaller)var2).registerSessionCallback((SessionCallback)var1);
   }
}
