import android.content.Context;
import android.content.Intent;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_absworkout_butt_homeworkout_fitness_loseweight_989599984 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      Object var1 = EasyMock.createMock(Intent.class);
      var2.stopService((Intent)var1);
   }
}
