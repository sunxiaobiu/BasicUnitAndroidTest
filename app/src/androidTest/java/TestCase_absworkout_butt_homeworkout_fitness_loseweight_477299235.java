import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_absworkout_butt_homeworkout_fitness_loseweight_477299235 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("activity");
      ActivityManager var3 = (ActivityManager)var2;
      List var4 = var3.getRunningTasks(2);
      var2 = var4.get(0);
      RunningTaskInfo var5 = (RunningTaskInfo)var2;
      ComponentName var6 = var5.topActivity;
      String var7 = var6.getPackageName();
   }
}
