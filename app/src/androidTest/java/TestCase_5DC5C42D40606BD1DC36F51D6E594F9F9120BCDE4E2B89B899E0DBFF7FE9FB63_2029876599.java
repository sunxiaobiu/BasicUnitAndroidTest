import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5DC5C42D40606BD1DC36F51D6E594F9F9120BCDE4E2B89B899E0DBFF7FE9FB63_2029876599 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      PackageManager var3 = var2.getPackageManager();
      Object var1 = EasyMock.createMock(ApplicationInfo.class);
      var3.getApplicationLogo((ApplicationInfo)var1);
   }
}
