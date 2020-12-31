import android.content.Context;
import android.os.storage.StorageManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aachen_rwth_de_flapp__281711487 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("storage");
      StorageManager var4 = (StorageManager)var3;
      String var1 = "android";
      var4.isObbMounted(var1);
   }
}
