import android.app.AppOpsManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0249F7DE168C625C51A2A423806DEB8B2A1A2A00162DE39C1E7D338DF900531F_373105688 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Object var4 = var3.getSystemService(AppOpsManager.class);
      AppOpsManager var5 = (AppOpsManager)var4;
      String var1 = "android";
      String var2 = "android";
      var5.noteProxyOpNoThrow(var1, var2);
   }
}
