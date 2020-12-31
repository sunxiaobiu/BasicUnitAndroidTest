import android.app.AlarmManager;
import android.app.AlarmManager.AlarmClockInfo;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5ABC95A356EABEA8FCD980D2F51D4D3F18DBF767AD2F01F3A88089760127BFEC_1948750910 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      Object var2 = var1.getSystemService("alarm");
      AlarmManager var3 = (AlarmManager)var2;
      AlarmClockInfo var4 = var3.getNextAlarmClock();
   }
}
