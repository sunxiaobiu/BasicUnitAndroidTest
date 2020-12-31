import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_huawei_phoneservice_1020717252 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Object var4 = var3.getSystemService("jobscheduler");
      JobScheduler var5 = (JobScheduler)var4;
      List var6 = var5.getAllPendingJobs();
      Iterator var7 = var6.iterator();
      var4 = var7.next();
      JobInfo var8 = (JobInfo)var4;
      long var1 = var8.getMinLatencyMillis();
   }
}
