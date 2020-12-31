import android.media.MediaPlayer;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_030D124786C89795F532D5B231928C1861CA5D002094A7E9E1C8AA4039992E05_1466981238 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(MediaPlayer.class);
      long var1 = 1L;
      ((MediaPlayer)var3).seekTo(var1, 3);
   }
}
