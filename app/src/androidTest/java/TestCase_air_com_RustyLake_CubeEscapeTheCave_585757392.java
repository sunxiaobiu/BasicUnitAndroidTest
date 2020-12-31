import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_com_RustyLake_CubeEscapeTheCave_585757392 {
   @Test
   public void testCase() throws Exception {
      MediaMetadataRetriever var3 = new MediaMetadataRetriever();
      Object var1 = null;
      Object var2 = EasyMock.createMock(Uri.class);
      var3.setDataSource((Context)var1, (Uri)var2);
   }
}
