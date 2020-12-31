import android.media.FaceDetector.Face;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_android_service_one_1325373351 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(Face.class);
      float var2 = ((Face)var1).eyesDistance();
   }
}
