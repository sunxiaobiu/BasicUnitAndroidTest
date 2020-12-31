import android.content.Context;
import android.content.RestrictionEntry;
import android.content.RestrictionsManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.Iterator;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_adobe_reader_1818742042 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var1 = var2.getSystemService("restrictions");
      RestrictionsManager var5 = (RestrictionsManager)var1;
      String var3 = var2.getPackageName();
      List var4 = var5.getManifestRestrictions(var3);
      Iterator var6 = var4.iterator();
      var1 = var6.next();
      RestrictionEntry var7 = (RestrictionEntry)var1;
      var3 = var7.getKey();
   }
}
