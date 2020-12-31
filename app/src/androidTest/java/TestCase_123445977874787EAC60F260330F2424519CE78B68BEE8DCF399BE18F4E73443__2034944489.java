import android.os.Handler;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.MediaSessionCompat.Callback;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_123445977874787EAC60F260330F2424519CE78B68BEE8DCF399BE18F4E73443__2034944489 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(MediaSessionCompat.class);
      Object var1 = null;
      Object var2 = EasyMock.createMock(Handler.class);
      ((MediaSessionCompat)var3).setCallback((Callback)var1, (Handler)var2);
   }
}
