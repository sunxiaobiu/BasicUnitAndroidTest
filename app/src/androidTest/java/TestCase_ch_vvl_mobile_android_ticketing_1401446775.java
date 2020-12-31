import android.content.res.AssetFileDescriptor;
import android.media.SoundPool;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ch_vvl_mobile_android_ticketing_1401446775 {
   @Test
   public void testCase() throws Exception {
      SoundPool var2 = new SoundPool(1, 3, 0);
      Object var1 = EasyMock.createMock(AssetFileDescriptor.class);
      var2.load((AssetFileDescriptor)var1, 1);
   }
}
