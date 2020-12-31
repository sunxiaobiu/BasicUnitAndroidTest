import android.media.MediaCrypto;
import androidx.test.runner.AndroidJUnit4;
import java.util.UUID;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_erosnow__2128517818 {
   public static void testCase() throws Exception {
      Object var0 = null;
      boolean var1 = MediaCrypto.isCryptoSchemeSupported((UUID)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
