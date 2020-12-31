import android.security.NetworkSecurityPolicy;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_01681CE93DE6829453F5496868F24EC20F77072F3D5CF74E4AA130A759BBA5D0_514099998 {
   @Test
   public void testCase() throws Exception {
      NetworkSecurityPolicy var2 = NetworkSecurityPolicy.getInstance();
      String var1 = "android";
      var2.isCleartextTrafficPermitted(var1);
   }
}
