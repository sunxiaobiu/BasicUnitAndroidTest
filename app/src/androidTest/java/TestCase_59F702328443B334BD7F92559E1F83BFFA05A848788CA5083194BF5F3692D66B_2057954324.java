import android.app.Activity;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import androidx.work.WorkManager;
import com.example.android.testing.unittesting.basicunitandroidtest.MyActivity;
import java.util.UUID;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_59F702328443B334BD7F92559E1F83BFFA05A848788CA5083194BF5F3692D66B_2057954324 {
   @Rule
   public ActivityTestRule mActivityRule;

   @Test
   public void testCase() throws Exception {
      ActivityTestRule var2 = this.mActivityRule;
      Activity var3 = var2.getActivity();
      Context var4 = InstrumentationRegistry.getTargetContext();
      WorkManager var5 = WorkManager.getInstance(var4);
      Object var1 = null;
      var5.getWorkInfoByIdLiveData((UUID)var1);
   }

   public TestCase_59F702328443B334BD7F92559E1F83BFFA05A848788CA5083194BF5F3692D66B_2057954324() {
      ActivityTestRule var1 = new ActivityTestRule(MyActivity.class);
      this.mActivityRule = var1;
   }
}
