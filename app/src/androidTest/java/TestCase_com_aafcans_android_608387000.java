import android.nfc.Tag;
import android.nfc.tech.Ndef;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_aafcans_android_608387000 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Tag.class);
      Ndef var1 = Ndef.get((Tag)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
