import android.content.Context;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_freeappcompany_tonyperkins__243109508 {
   @Test
   public void testCase() throws Exception {
      Context var2 = InstrumentationRegistry.getTargetContext();
      MediaSessionCompat var1 = new MediaSessionCompat(var2, "MediaSessionHelper");
      var1.setPlaybackToLocal(3);
   }
}
