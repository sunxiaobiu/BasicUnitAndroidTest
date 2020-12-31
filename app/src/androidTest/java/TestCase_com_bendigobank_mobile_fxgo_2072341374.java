import android.nfc.tech.IsoDep;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bendigobank_mobile_fxgo_2072341374 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(IsoDep.class);
      byte[] var1 = new byte[1];
      ((IsoDep)var2).transceive(var1);
   }
}
