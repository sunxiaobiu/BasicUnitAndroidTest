import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aadevelopers_com_khawabnamahazratyousufas_khawabkitabeer__1156491423 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Application.class);
      Object var1 = EasyMock.createMock(ActivityLifecycleCallbacks.class);
      ((Application)var2).unregisterActivityLifecycleCallbacks((ActivityLifecycleCallbacks)var1);
   }
}
