import android.appwidget.AppWidgetHost;
import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_deletescape_lawnchair_plah__361479414 {
   @Test
   public void testCase() throws Exception {
      Context var1 = InstrumentationRegistry.getTargetContext();
      AppWidgetHost var2 = new AppWidgetHost(var1, 1024);
      byte var3 = 1;
      var2.deleteAppWidgetId(var3);
   }
}
