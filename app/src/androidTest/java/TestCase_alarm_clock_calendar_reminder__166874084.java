import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.AlarmManager.AlarmClockInfo;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_alarm_clock_calendar_reminder__166874084 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      Object var4 = var3.getSystemService("alarm");
      AlarmManager var5 = (AlarmManager)var4;
      Object var1 = EasyMock.createMock(AlarmClockInfo.class);
      Object var2 = EasyMock.createMock(PendingIntent.class);
      var5.setAlarmClock((AlarmClockInfo)var1, (PendingIntent)var2);
   }
}
