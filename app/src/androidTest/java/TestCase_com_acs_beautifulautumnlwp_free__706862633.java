import android.opengl.GLES20;
import androidx.test.runner.AndroidJUnit4;
import java.nio.Buffer;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_acs_beautifulautumnlwp_free__706862633 {
   public static void testCase() throws Exception {
      byte var0 = 1;
      Object var1 = null;
      byte var2 = 1;
      GLES20.glBufferData(34962, var0, (Buffer)var1, var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
