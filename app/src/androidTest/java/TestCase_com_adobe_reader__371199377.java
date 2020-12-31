import android.content.Context;
import android.content.RestrictionsManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_adobe_reader__371199377 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("restrictions");
      RestrictionsManager var4 = (RestrictionsManager)var3;
      String var1 = "android";
      var4.getManifestRestrictions(var1);
   }
}
