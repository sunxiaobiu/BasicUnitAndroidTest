import android.content.Context;
import android.media.AsyncPlayer;
import android.media.AudioAttributes;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_another_music_player_58247484 {
   @Test
   public void testCase() throws Exception {
      AsyncPlayer var4 = new AsyncPlayer("BeepPlayer");
      Object var1 = EasyMock.createMock(Context.class);
      Object var2 = EasyMock.createMock(Uri.class);
      Object var3 = EasyMock.createMock(AudioAttributes.class);
      var4.play((Context)var1, (Uri)var2, false, (AudioAttributes)var3);
   }
}
