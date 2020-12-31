import android.app.AlarmManager;
import android.app.PendingIntent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_absworkout_butt_homeworkout_fitness_loseweight_783585694 {
   @Test
   public void testCase() throws Exception {
      Object var4 = EasyMock.createMock(AlarmManager.class);
      long var1 = 1L;
      Object var3 = EasyMock.createMock(PendingIntent.class);
      ((AlarmManager)var4).setExact(0, var1, (PendingIntent)var3);
   }
}
