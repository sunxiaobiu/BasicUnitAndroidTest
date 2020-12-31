import android.app.Activity;
import android.appwidget.AppWidgetHost;
import android.os.Bundle;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_deletescape_lawnchair_plah__966928789 {
   @Test
   public void testCase() throws Exception {
      Object var4 = EasyMock.createMock(AppWidgetHost.class);
      Object var1 = EasyMock.createMock(Activity.class);
      byte var2 = 1;
      byte var3 = 1;
      ((AppWidgetHost)var4).startAppWidgetConfigureActivityForResult((Activity)var1, var2, 0, var3, (Bundle)null);
   }
}
