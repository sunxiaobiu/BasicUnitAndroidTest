import android.media.SoundPool;
import android.media.SoundPool.Builder;
import androidx.test.runner.AndroidJUnit4;
import java.io.FileDescriptor;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_gg_app_qd_ev_827127495 {
   @Test
   public void testCase() throws Exception {
      Builder var6 = new Builder();
      SoundPool var7 = var6.build();
      var7 = new SoundPool(1, 3, 1);
      Object var1 = null;
      long var2 = 1L;
      long var4 = 1L;
      var7.load((FileDescriptor)var1, var2, var4, 1);
   }
}
