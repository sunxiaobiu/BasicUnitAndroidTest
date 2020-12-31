import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import androidx.test.runner.AndroidJUnit4;
import java.util.Map;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ar_gravity_swiss__1669043969 {
   @Test
   public void testCase() throws Exception {
      MediaPlayer var4 = new MediaPlayer();
      Object var1 = EasyMock.createMock(Context.class);
      Object var2 = EasyMock.createMock(Uri.class);
      Object var3 = null;
      var4.setDataSource((Context)var1, (Uri)var2, (Map)var3);
   }
}
