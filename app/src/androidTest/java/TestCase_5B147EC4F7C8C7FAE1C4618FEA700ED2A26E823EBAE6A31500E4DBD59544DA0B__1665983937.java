import android.content.Context;
import android.os.storage.OnObbStateChangeListener;
import android.os.storage.StorageManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5B147EC4F7C8C7FAE1C4618FEA700ED2A26E823EBAE6A31500E4DBD59544DA0B__1665983937 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Object var4 = var3.getSystemService("storage");
      StorageManager var5 = (StorageManager)var4;
      String var1 = "android";
      Object var2 = null;
      var5.unmountObb(var1, true, (OnObbStateChangeListener)var2);
   }
}
