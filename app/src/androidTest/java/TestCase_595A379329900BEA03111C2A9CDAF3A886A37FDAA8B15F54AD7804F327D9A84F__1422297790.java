import android.content.Context;
import android.content.pm.PackageManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_595A379329900BEA03111C2A9CDAF3A886A37FDAA8B15F54AD7804F327D9A84F__1422297790 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      PackageManager var2 = var1.getPackageManager();
      List var3 = var2.queryContentProviders((String)"android", 0, 0);
   }
}
