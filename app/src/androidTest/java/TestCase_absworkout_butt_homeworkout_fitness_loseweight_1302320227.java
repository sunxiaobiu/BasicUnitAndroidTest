import android.content.SharedPreferences;
import androidx.test.runner.AndroidJUnit4;
import java.util.Set;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_absworkout_butt_homeworkout_fitness_loseweight_1302320227 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(SharedPreferences.class);
      Object var1 = null;
      String var2 = "android";
      ((SharedPreferences)var3).getStringSet(var2, (Set)var1);
   }
}
