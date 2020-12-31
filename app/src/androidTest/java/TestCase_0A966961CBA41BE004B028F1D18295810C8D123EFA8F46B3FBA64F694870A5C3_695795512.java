import android.media.MediaRecorder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_0A966961CBA41BE004B028F1D18295810C8D123EFA8F46B3FBA64F694870A5C3_695795512 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(MediaRecorder.class);
      double var1 = 1.0D;
      ((MediaRecorder)var3).setCaptureRate(var1);
   }
}
