import android.content.Context;
import android.os.UserManager;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_absworkout_butt_homeworkout_fitness_loseweight__1539767245 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var3 = var2.getSystemService("user");
      UserManager var4 = (UserManager)var3;
      String var1 = "android";
      var4.getApplicationRestrictions(var1);
   }
}
