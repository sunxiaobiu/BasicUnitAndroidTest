import android.content.Intent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_dcpetitions_mobile_iphone__566360144 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(Intent.class);
      long var1 = ((Intent)var3).getLongExtra("extra_download_id", -1L);
   }
}
