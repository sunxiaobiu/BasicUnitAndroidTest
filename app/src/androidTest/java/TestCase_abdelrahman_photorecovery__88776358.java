import android.app.ActivityManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery__88776358 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ActivityManager.class);
      int var2 = ((ActivityManager)var1).getLargeMemoryClass();
   }
}
