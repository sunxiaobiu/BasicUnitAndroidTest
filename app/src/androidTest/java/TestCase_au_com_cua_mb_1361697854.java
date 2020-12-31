import android.media.CamcorderProfile;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_cua_mb_1361697854 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      byte var1 = 1;
      CamcorderProfile.get(var0, var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
