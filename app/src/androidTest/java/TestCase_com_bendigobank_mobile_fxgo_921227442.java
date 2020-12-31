import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_bendigobank_mobile_fxgo_921227442 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Tag.class);
      IsoDep var2 = IsoDep.get((Tag)var1);
      var2.connect();
   }
}
