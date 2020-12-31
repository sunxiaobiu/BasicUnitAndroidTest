import android.graphics.PointF;
import android.media.FaceDetector.Face;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_android_service_one__811182550 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Face.class);
      Object var1 = EasyMock.createMock(PointF.class);
      ((Face)var2).getMidPoint((PointF)var1);
   }
}
