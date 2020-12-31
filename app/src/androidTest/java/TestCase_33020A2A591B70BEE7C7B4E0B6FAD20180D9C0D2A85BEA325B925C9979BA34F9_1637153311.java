import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder.OnHeaderDecodedListener;
import android.graphics.ImageDecoder.Source;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_33020A2A591B70BEE7C7B4E0B6FAD20180D9C0D2A85BEA325B925C9979BA34F9_1637153311 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Source.class);
      Object var1 = null;
      ImageDecoder.decodeBitmap((Source)var0, (OnHeaderDecodedListener)var1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
