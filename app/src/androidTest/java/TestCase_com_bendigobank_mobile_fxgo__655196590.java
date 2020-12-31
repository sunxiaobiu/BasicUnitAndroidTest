import android.nfc.tech.IsoDep;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bendigobank_mobile_fxgo__655196590 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(IsoDep.class);
      boolean var2 = ((IsoDep)var1).isConnected();
   }
}
