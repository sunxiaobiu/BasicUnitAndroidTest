import android.app.AlarmManager;
import android.app.PendingIntent;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abc_kids_preschool_learning_phonics_songs_videos__387413118 {
   @Test
   public void testCase() throws Exception {
      Object var6 = EasyMock.createMock(AlarmManager.class);
      long var1 = 1L;
      long var3 = 1L;
      Object var5 = EasyMock.createMock(PendingIntent.class);
      ((AlarmManager)var6).setWindow(1, var1, var3, (PendingIntent)var5);
   }
}
