import android.appwidget.AppWidgetHost;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_amlcurran_jump_692809551 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(AppWidgetHost.class);
      ((AppWidgetHost)var1).startListening();
   }
}
