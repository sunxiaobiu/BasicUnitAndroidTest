import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug.MemoryInfo;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ccc71_pmw2__1077412641 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("activity");
      ActivityManager var4 = (ActivityManager)var3;
      int[] var1 = new int[1];
      MemoryInfo[] var5 = var4.getProcessMemoryInfo(var1);
      MemoryInfo var6 = var5[0];
      int var7 = var6.getTotalPrivateDirty();
   }
}
