import android.security.NetworkSecurityPolicy;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_01681CE93DE6829453F5496868F24EC20F77072F3D5CF74E4AA130A759BBA5D0__183763507 {
   @Test
   public void testCase() throws Exception {
      NetworkSecurityPolicy var1 = NetworkSecurityPolicy.getInstance();
      boolean var2 = var1.isCleartextTrafficPermitted();
   }
}
