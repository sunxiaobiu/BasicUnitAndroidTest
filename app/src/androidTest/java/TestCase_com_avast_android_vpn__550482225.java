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
public class TestCase_com_avast_android_vpn__550482225 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("jobscheduler");
      JobScheduler var3 = (JobScheduler)var2;
      List var4 = var3.getAllPendingJobs();
      Iterator var5 = var4.iterator();
      var2 = var5.next();
      JobInfo var6 = (JobInfo)var2;
      String var7 = var6.toString();
   }
}
