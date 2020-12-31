import android.app.job.JobInfo;
import android.os.PersistableBundle;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0249F7DE168C625C51A2A423806DEB8B2A1A2A00162DE39C1E7D338DF900531F_200829554 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(JobInfo.class);
      PersistableBundle var2 = ((JobInfo)var1).getExtras();
      boolean var3 = var2.containsKey("EXTRA_WORK_SPEC_ID");
   }
}
