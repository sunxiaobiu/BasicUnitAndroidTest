import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_cms_lock__427558940 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      PackageManager var3 = var2.getPackageManager();
      Object var1 = EasyMock.createMock(Intent.class);
      var3.queryIntentActivities((Intent)var1, 0);
      Object var4 = EasyMock.createMock(List.class);
      int var5 = ((List)var4).size();
      ArrayList var6 = new ArrayList(var5);
      Iterator var7 = var6.iterator();
      var4 = var7.next();
      ResolveInfo var8 = (ResolveInfo)var4;
      var1 = EasyMock.createMock(PackageManager.class);
      var8.loadLabel((PackageManager)var1);
   }
}
