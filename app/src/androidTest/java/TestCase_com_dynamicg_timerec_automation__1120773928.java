import android.nfc.Tag;
import android.nfc.tech.NdefFormatable;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_dynamicg_timerec_automation__1120773928 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Tag.class);
      NdefFormatable var1 = NdefFormatable.get((Tag)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
