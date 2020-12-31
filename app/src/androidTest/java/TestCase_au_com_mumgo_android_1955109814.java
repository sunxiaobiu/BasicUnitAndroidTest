import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.widget.RemoteViews;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_mumgo_android_1955109814 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      AppWidgetManager var3 = AppWidgetManager.getInstance(var2);
      int[] var1 = new int[1];
      var3.updateAppWidget(var1, (RemoteViews)null);
   }
}
