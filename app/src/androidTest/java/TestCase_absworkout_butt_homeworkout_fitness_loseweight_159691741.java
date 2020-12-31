import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_absworkout_butt_homeworkout_fitness_loseweight_159691741 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(SharedPreferences.class);
      Editor var4 = ((SharedPreferences)var3).edit();
      String var1 = "android";
      float var2 = 1.0F;
      var4.putFloat(var1, var2);
   }
}
