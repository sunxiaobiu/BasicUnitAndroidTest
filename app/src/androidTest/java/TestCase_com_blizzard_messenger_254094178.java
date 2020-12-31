import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_blizzard_messenger_254094178 {
   public static void testCase() throws Exception {
      Object var0 = null;
      Object var1 = EasyMock.createMock(AudioAttributes.class);
      byte var2 = 1;
      MediaPlayer.create((Context)var0, 2131623937, (AudioAttributes)var1, var2);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
