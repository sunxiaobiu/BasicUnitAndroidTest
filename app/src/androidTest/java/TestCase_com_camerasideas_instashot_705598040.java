import android.graphics.SurfaceTexture;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_camerasideas_instashot_705598040 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(SurfaceTexture.class);
      long var1 = ((SurfaceTexture)var3).getTimestamp();
   }
}
