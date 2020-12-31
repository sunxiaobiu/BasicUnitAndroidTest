import android.app.AlarmManager;
import android.app.AlarmManager.OnAlarmListener;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_33020A2A591B70BEE7C7B4E0B6FAD20180D9C0D2A85BEA325B925C9979BA34F9_1889711817 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(AlarmManager.class);
      Object var1 = null;
      ((AlarmManager)var2).cancel((OnAlarmListener)var1);
   }
}
