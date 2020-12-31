import android.net.Uri;
import android.support.v4.media.MediaDescriptionCompat.Builder;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_another_music_player__1035304031 {
   @Test
   public void testCase() throws Exception {
      Builder var2 = new Builder();
      Object var1 = EasyMock.createMock(Uri.class);
      var2.setMediaUri((Uri)var1);
   }
}
