import android.os.StrictMode;
import android.os.StrictMode.VmPolicy;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aang_ind_reefal_1773445268 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(VmPolicy.class);
      StrictMode.setVmPolicy((VmPolicy)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
