import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.widget.RemoteViews;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_arproductions_andrew_worklog__548595482 {
   @Test
   public void testCase() throws Exception {
      Context var3 = InstrumentationRegistry.getTargetContext();
      AppWidgetManager var4 = AppWidgetManager.getInstance(var3);
      Object var1 = EasyMock.createMock(ComponentName.class);
      Object var2 = EasyMock.createMock(RemoteViews.class);
      var4.updateAppWidget((ComponentName)var1, (RemoteViews)var2);
   }
}
