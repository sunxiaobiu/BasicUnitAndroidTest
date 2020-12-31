import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Bundle;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_3C254EBF6700A64DA87941954B2A33322BAD3908E85463E655685F827CB8930B__122384666 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("jobscheduler");
      JobScheduler var3 = (JobScheduler)var2;
      JobInfo var4 = var3.getPendingJob(2147483524);
      Bundle var5 = var4.getTransientExtras();
   }
}
