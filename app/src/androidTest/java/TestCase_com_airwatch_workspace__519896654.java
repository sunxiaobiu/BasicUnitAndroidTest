import android.appwidget.AppWidgetHost;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_airwatch_workspace__519896654 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      AppWidgetHost var1 = new AppWidgetHost(var2, 1024);
      var1.deleteHost();
   }
}
