import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.widget.RemoteViews;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_595A379329900BEA03111C2A9CDAF3A886A37FDAA8B15F54AD7804F327D9A84F__681923289 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      AppWidgetManager var4 = AppWidgetManager.getInstance(var3);
      byte var1 = 1;
      Object var2 = EasyMock.createMock(RemoteViews.class);
      var4.partiallyUpdateAppWidget(var1, (RemoteViews)var2);
   }
}
