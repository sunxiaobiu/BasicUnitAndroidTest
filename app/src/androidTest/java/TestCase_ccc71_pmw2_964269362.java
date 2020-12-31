import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ccc71_pmw2_964269362 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(PackageManager.class);
      Object var1 = EasyMock.createMock(ApplicationInfo.class);
      Drawable var3 = ((PackageManager)var2).getApplicationIcon((ApplicationInfo)var1);
      StateListDrawable var4 = (StateListDrawable)var3;
      var3 = var4.getCurrent();
   }
}
