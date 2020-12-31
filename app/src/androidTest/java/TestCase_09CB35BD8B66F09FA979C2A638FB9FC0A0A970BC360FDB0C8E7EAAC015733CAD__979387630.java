import android.app.Activity;
import android.content.Context;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import org.easymock.EasyMock;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_09CB35BD8B66F09FA979C2A638FB9FC0A0A970BC360FDB0C8E7EAAC015733CAD__979387630 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var3 = this.mActivityRule;
      Activity var4 = var3.getActivity();
      Context var5 = var4.getApplicationContext();
      WorkManager var6 = WorkManager.getInstance(var5);
      Object var1 = EasyMock.createMock(ExistingWorkPolicy.class);
      Object var2 = EasyMock.createMock(OneTimeWorkRequest.class);
      var6.enqueueUniqueWork("APISyncWorker", (ExistingWorkPolicy)var1, (OneTimeWorkRequest)var2);
   }

   public TestCase_09CB35BD8B66F09FA979C2A638FB9FC0A0A970BC360FDB0C8E7EAAC015733CAD__979387630() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
