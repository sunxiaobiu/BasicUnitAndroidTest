import android.appwidget.AppWidgetHostView;
import android.os.Bundle;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_deletescape_lawnchair_plah_563865420 {
   @Test
   public void testCase() throws Exception {
      Object var5 = EasyMock.createMock(AppWidgetHostView.class);
      byte var1 = 1;
      byte var2 = 1;
      byte var3 = 1;
      byte var4 = 1;
      ((AppWidgetHostView)var5).updateAppWidgetSize((Bundle)null, var1, var2, var3, var4);
   }
}
