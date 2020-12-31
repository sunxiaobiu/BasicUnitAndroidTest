import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_014117FE8FF081C26E42C43B5EAEA0246CE8A15FDE0BED5DD61231948A8E2EF6__613859061 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(JobScheduler.class);
      Object var1 = EasyMock.createMock(JobInfo.class);
      Object var2 = EasyMock.createMock(JobWorkItem.class);
      ((JobScheduler)var3).enqueue((JobInfo)var1, (JobWorkItem)var2);
   }
}
