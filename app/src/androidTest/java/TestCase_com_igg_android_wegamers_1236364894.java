import android.content.Context;
import android.os.DropBoxManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_igg_android_wegamers_1236364894 {
   @Test
   public void testCase() throws Exception {
      Context var4 = InstrumentationRegistry.getTargetContext();
      Object var5 = var4.getSystemService("dropbox");
      DropBoxManager var6 = (DropBoxManager)var5;
      String var1 = "android";
      long var2 = 1L;
      var6.getNextEntry(var1, var2);
   }
}
