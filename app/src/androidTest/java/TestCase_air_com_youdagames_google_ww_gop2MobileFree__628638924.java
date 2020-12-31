import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_com_youdagames_google_ww_gop2MobileFree__628638924 {
   @Test
   public void testCase() throws Exception {
      MediaPlayer var3 = new MediaPlayer();
      Object var1 = EasyMock.createMock(Context.class);
      Object var2 = EasyMock.createMock(Uri.class);
      var3.setDataSource((Context)var1, (Uri)var2);
   }
}
