import android.app.Application;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_amadeus_merci_client_ui_810268854 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Application.class);
      byte var1 = 1;
      ((Application)var2).getDrawable(var1);
   }
}
