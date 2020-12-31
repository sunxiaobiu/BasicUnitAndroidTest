import android.net.Uri;
import android.telecom.Call;
import android.telecom.Call.Details;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_callapp_contacts__1603873455 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Call.class);
      Details var2 = ((Call)var1).getDetails();
      Uri var3 = var2.getHandle();
   }
}
