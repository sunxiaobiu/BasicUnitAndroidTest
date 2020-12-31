import android.util.Base64OutputStream;
import androidx.test.runner.AndroidJUnit4;
import java.io.ByteArrayOutputStream;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_alxg_fartprank__2125349048 {
   @Test
   public void testCase() throws Exception {
      ByteArrayOutputStream var2 = new ByteArrayOutputStream(4096);
      Base64OutputStream var1 = new Base64OutputStream(var2, 10);
      Base64OutputStream var3 = var1;
      byte[] var4 = new byte[1];
      var3.write(var4);
   }
}
