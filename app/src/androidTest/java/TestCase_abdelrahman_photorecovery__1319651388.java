import android.content.Intent;
import android.content.pm.PackageManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery__1319651388 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(PackageManager.class);
      Object var1 = EasyMock.createMock(Intent.class);
      ((PackageManager)var2).resolveActivity((Intent)var1, 65536);
   }
}
