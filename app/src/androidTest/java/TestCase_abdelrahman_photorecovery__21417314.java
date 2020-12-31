import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery__21417314 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(PackageInfo.class);
      Signature[] var2 = ((PackageInfo)var1).signatures;
      Signature var3 = var2[0];
      byte[] var4 = var3.toByteArray();
   }
}
