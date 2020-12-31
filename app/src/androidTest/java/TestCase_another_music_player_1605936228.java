import android.support.v4.media.session.PlaybackStateCompat.Builder;
import android.support.v4.media.session.PlaybackStateCompat.CustomAction;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_another_music_player_1605936228 {
   @Test
   public void testCase() throws Exception {
      Builder var2 = new Builder();
      Object var1 = EasyMock.createMock(CustomAction.class);
      var2.addCustomAction((CustomAction)var1);
   }
}
