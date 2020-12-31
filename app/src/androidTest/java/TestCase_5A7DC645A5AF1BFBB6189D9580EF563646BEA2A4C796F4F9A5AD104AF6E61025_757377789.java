import android.appwidget.AppWidgetManager;
import android.widget.RemoteViews;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_5A7DC645A5AF1BFBB6189D9580EF563646BEA2A4C796F4F9A5AD104AF6E61025_757377789 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(AppWidgetManager.class);
      int[] var1 = new int[1];
      Object var2 = EasyMock.createMock(RemoteViews.class);
      ((AppWidgetManager)var3).partiallyUpdateAppWidget(var1, (RemoteViews)var2);
   }
}
