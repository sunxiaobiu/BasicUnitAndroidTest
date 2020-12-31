import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.Iterator;
import java.util.List;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_backflipstudios_android_dragonvale2_1137545605 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      PackageManager var4 = var3.getPackageManager();
      int var1 = 131136;
      Object var2 = EasyMock.createMock(Intent.class);
      List var5 = var4.queryIntentActivities((Intent)var2, var1);
      Iterator var6 = var5.iterator();
      Object var7 = var6.next();
      ResolveInfo var8 = (ResolveInfo)var7;
      IntentFilter var9 = var8.filter;
      var6 = var9.schemesIterator();
   }
}
