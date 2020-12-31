import android.appwidget.AppWidgetHostView;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Rect;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_deletescape_lawnchair_plah__1241544007 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Context.class);
      Object var1 = EasyMock.createMock(ComponentName.class);
      AppWidgetHostView.getDefaultPaddingForWidget((Context)var0, (ComponentName)var1, (Rect)null);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
