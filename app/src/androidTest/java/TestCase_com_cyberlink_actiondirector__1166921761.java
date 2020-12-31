import android.graphics.SurfaceTexture;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_cyberlink_actiondirector__1166921761 {
   @Test
   public void testCase() throws Exception {
      int[] var2 = new int[1];
      int var3 = var2[0];
      byte var4 = -1;
      SurfaceTexture var1 = new SurfaceTexture(var4);
      var1.detachFromGLContext();
   }
}
