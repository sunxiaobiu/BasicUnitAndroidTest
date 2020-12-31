import android.app.ActivityManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_gov_casa_flightsafetyaustralia__1368964207 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ActivityManager.class);
      int[] var1 = new int[1];
      ((ActivityManager)var2).getProcessMemoryInfo(var1);
   }
}
