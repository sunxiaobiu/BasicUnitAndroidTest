import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ac_ewha_web_manager_291561317 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("activity");
      ActivityManager var3 = (ActivityManager)var2;
      List var4 = var3.getRunningTasks(10);
      Iterator var5 = var4.iterator();
      var2 = var5.next();
      RunningTaskInfo var6 = (RunningTaskInfo)var2;
      ComponentName var7 = var6.topActivity;
      String var8 = var7.getShortClassName();
   }
}
