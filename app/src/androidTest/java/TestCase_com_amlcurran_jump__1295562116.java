import android.appwidget.AppWidgetManager;
import android.os.Bundle;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_amlcurran_jump__1295562116 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(AppWidgetManager.class);
      byte var1 = 1;
      Object var2 = EasyMock.createMock(Bundle.class);
      ((AppWidgetManager)var3).updateAppWidgetOptions(var1, (Bundle)var2);
   }
}
