import android.content.Context;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_absworkout_butt_homeworkout_fitness_loseweight__884108192 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      PackageManager var2 = var1.getPackageManager();
      PackageInstaller var3 = var2.getPackageInstaller();
      List var4 = var3.getAllSessions();
   }
}
