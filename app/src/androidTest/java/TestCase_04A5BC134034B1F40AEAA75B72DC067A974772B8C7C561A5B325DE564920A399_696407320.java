import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.PersistableBundle;
import androidx.test.runner.AndroidJUnit4;
import java.util.Iterator;
import java.util.List;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_04A5BC134034B1F40AEAA75B72DC067A974772B8C7C561A5B325DE564920A399_696407320 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(JobScheduler.class);
      List var2 = ((JobScheduler)var1).getAllPendingJobs();
      Iterator var3 = var2.iterator();
      var1 = var3.next();
      JobInfo var4 = (JobInfo)var1;
      PersistableBundle var5 = var4.getExtras();
      int var6 = var5.getInt("attemptNumber");
   }
}
