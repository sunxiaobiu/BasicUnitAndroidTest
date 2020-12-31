import android.opengl.GLU;
import androidx.test.runner.AndroidJUnit4;
import javax.microedition.khronos.opengles.GL10;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_dobango__1967575454 {
   public static void testCase() throws Exception {
      Object var0 = null;
      float var1 = 1.0F;
      GLU.gluPerspective((GL10)var0, 60.0F, var1, 0.5F, 1500.0F);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
