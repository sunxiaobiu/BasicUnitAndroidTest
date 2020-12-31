import android.app.WallpaperInfo;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_deletescape_lawnchair_plah__1273341096 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      PackageManager var1 = var3.getPackageManager();
      Intent var2 = new Intent("android.service.wallpaper.WallpaperService");
      List var5 = var1.queryIntentServices(var2, 128);
      Iterator var6 = var5.iterator();
      Object var7 = var6.next();
      ResolveInfo var8 = (ResolveInfo)var7;
      WallpaperInfo var9 = new WallpaperInfo(var3, var8);
      String var4 = var9.getServiceName();
   }
}
