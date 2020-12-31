import android.appwidget.AppWidgetManager;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_medicalid_free__1546595973 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(AppWidgetManager.class);
      byte var1 = 1;
      ((AppWidgetManager)var2).getAppWidgetOptions(var1);
   }
}
