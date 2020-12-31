import android.content.Context;
import android.content.ContextWrapper;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ae_mbrf_ddl_app_213660026 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      ContextWrapper var2 = (ContextWrapper)var1;
      var1 = var2.getBaseContext();
   }
}
