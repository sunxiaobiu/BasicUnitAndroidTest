import android.content.Context;
import android.os.storage.OnObbStateChangeListener;
import android.os.storage.StorageManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aachen_rwth_de_flapp_230862196 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Object var4 = var3.getSystemService("storage");
      StorageManager var5 = (StorageManager)var4;
      String var1 = "android";
      Object var2 = null;
      var5.mountObb(var1, (String)"android", (OnObbStateChangeListener)var2);
   }
}
