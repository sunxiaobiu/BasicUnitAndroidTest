import android.content.res.Resources;
import android.preference.PreferenceActivity.Header;
import androidx.test.runner.AndroidJUnit4;
import java.util.Iterator;
import java.util.List;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_adsi_kioware_client_mobile_app_1373507957 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(List.class);
      Iterator var3 = ((List)var2).iterator();
      var2 = var3.next();
      Header var4 = (Header)var2;
      Object var1 = EasyMock.createMock(Resources.class);
      var4.getTitle((Resources)var1);
   }
}
