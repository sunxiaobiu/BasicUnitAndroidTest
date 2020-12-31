import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_absworkout_butt_homeworkout_fitness_loseweight_1787557643 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("activity");
      ActivityManager var4 = (ActivityManager)var3;
      Object var1 = EasyMock.createMock(MemoryInfo.class);
      var4.getMemoryInfo((MemoryInfo)var1);
   }
}
