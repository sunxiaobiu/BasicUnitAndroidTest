import android.app.Activity;
import android.appwidget.AppWidgetHost;
import android.appwidget.AppWidgetProviderInfo;
import android.content.Context;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_amlcurran_jump_198203889 {
   @Test
   public void testCase() throws Exception {
      Object var4 = EasyMock.createMock(AppWidgetHost.class);
      Object var1 = EasyMock.createMock(Activity.class);
      byte var2 = 1;
      Object var3 = EasyMock.createMock(AppWidgetProviderInfo.class);
      ((AppWidgetHost)var4).createView((Context)var1, var2, (AppWidgetProviderInfo)var3);
   }
}
