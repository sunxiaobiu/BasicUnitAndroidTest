import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_alarm_clock_calendar_reminder__936137629 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      AppWidgetManager var3 = AppWidgetManager.getInstance(var2);
      Object var1 = EasyMock.createMock(ComponentName.class);
      var3.getAppWidgetIds((ComponentName)var1);
   }
}
