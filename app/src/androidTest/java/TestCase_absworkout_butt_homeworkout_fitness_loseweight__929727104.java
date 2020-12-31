import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_absworkout_butt_homeworkout_fitness_loseweight__929727104 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      PackageManager var3 = var2.getPackageManager();
      PackageInfo var4 = var3.getPackageInfo("com.android.vending", 8256);
      Signature[] var5 = var4.signatures;
      Signature var6 = var5[0];
      Object var1 = EasyMock.createMock(Signature.class);
      var6.equals(var1);
   }
}
