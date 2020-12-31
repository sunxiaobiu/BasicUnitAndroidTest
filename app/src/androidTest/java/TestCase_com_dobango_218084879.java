import android.opengl.GLU;
import androidx.test.runner.AndroidJUnit4;
import javax.microedition.khronos.opengles.GL10;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_dobango_218084879 {
   public static void testCase() throws Exception {
      Object var0 = null;
      float var1 = 1.0F;
      float var2 = 1.0F;
      float var3 = 1.0F;
      float var4 = 1.0F;
      float var5 = 1.0F;
      GLU.gluLookAt((GL10)var0, var1, var2, var3, var4, var5, 0.0F, 0.0F, 1.0F, 0.0F);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
