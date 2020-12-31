import android.appwidget.AppWidgetManager;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_alarm_clock_calendar_reminder__153903132 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      AppWidgetManager var3 = AppWidgetManager.getInstance(var2);
      int[] var1 = new int[1];
      var3.notifyAppWidgetViewDataChanged(var1, 2131296439);
   }
}
