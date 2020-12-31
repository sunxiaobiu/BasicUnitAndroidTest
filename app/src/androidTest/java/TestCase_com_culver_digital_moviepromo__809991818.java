import android.nfc.Tag;
import android.nfc.tech.Ndef;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_culver_digital_moviepromo__809991818 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Tag.class);
      Ndef var2 = Ndef.get((Tag)var1);
      var2.close();
   }
}
