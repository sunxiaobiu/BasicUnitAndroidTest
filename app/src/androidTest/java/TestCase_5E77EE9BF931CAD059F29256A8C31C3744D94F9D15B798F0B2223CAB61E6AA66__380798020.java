import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5E77EE9BF931CAD059F29256A8C31C3744D94F9D15B798F0B2223CAB61E6AA66__380798020 {
   @Test
   public void testCase() throws Exception {
      Context var4 = InstrumentationRegistry.getTargetContext();
      PackageManager var1 = var4.getPackageManager();
      Object var2 = EasyMock.createMock(Class.class);
      Intent var3 = new Intent(var4, (Class)var2);
      ResolveInfo var5 = var1.resolveService(var3, 1024);
      ServiceInfo var6 = var5.serviceInfo;
      var4 = null;
      String var7 = var4.toString();
   }
}
