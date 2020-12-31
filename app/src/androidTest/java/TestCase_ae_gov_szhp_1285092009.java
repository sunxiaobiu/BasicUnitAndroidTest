import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_gov_szhp_1285092009 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Application.class);
      Object var1 = null;
      ((Application)var2).registerActivityLifecycleCallbacks((ActivityLifecycleCallbacks)var1);
   }
}
