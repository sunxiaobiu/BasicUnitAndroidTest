import android.content.Context;
import android.content.SharedPreferences;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_absworkout_butt_homeworkout_fitness_loseweight__93881800 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      SharedPreferences var2 = var1.getSharedPreferences("ctrl_sp", 0);
      boolean var3 = var2.contains("user_ratio");
   }
}
