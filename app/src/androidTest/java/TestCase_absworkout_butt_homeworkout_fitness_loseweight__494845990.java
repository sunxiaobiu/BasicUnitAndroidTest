import android.content.SharedPreferences;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_absworkout_butt_homeworkout_fitness_loseweight__494845990 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(SharedPreferences.class);
      float var1 = 1.0F;
      String var2 = "android";
      ((SharedPreferences)var3).getFloat(var2, var1);
   }
}
