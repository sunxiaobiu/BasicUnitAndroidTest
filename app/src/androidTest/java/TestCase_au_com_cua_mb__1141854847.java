import android.media.MediaRecorder;
import android.view.Surface;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_cua_mb__1141854847 {
   @Test
   public void testCase() throws Exception {
      MediaRecorder var2 = new MediaRecorder();
      Object var1 = EasyMock.createMock(Surface.class);
      var2.setPreviewDisplay((Surface)var1);
   }
}
