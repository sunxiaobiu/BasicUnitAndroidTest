import android.app.job.JobInfo;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_blinkenlights_android_vanilla_1161556775 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(JobInfo.class);
      long var1 = ((JobInfo)var3).getIntervalMillis();
   }
}
