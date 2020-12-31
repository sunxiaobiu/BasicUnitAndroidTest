import android.app.job.JobInfo;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_blinkenlights_android_vanilla_730096148 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(JobInfo.class);
      boolean var2 = ((JobInfo)var1).isRequireCharging();
   }
}
