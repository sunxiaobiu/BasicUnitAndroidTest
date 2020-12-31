import android.telecom.Call;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_callapp_contacts__2086980923 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Call.class);
      ((Call)var1).disconnect();
   }
}
