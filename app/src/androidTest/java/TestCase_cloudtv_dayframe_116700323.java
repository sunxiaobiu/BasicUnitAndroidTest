import android.content.Context;
import android.service.dreams.DreamService;
import android.view.Window;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_cloudtv_dayframe_116700323 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      DreamService var2 = (DreamService)var1;
      Window var3 = var2.getWindow();
   }
}
