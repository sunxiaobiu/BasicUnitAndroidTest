import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.io.File;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery__1620357302 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      File var2 = var1.getDatabasePath("com.google.android.gms.ads.db");
   }
}
