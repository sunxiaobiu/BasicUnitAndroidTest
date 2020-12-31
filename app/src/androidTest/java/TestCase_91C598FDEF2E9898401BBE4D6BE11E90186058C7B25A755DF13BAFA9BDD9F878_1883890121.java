import android.media.AudioAttributes;
import android.media.Ringtone;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_91C598FDEF2E9898401BBE4D6BE11E90186058C7B25A755DF13BAFA9BDD9F878_1883890121 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Ringtone.class);
      Object var1 = EasyMock.createMock(AudioAttributes.class);
      ((Ringtone)var2).setAudioAttributes((AudioAttributes)var1);
   }
}
