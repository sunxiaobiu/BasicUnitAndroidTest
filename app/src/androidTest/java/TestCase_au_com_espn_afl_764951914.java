import android.drm.DrmInfoRequest;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_espn_afl_764951914 {
   @Test
   public void testCase() throws Exception {
      DrmInfoRequest var2 = new DrmInfoRequest(3, "video/wvm");
      String var1 = "android";
      var2.put("WVDRMServerKey", var1);
   }
}
