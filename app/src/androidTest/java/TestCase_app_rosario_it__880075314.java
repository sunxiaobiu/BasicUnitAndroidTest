import android.os.Handler;
import android.os.Message;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_app_rosario_it__880075314 {
   @Test
   public void testCase() throws Exception {
      Message var2 = Message.obtain();
      Object var1 = EasyMock.createMock(Handler.class);
      var2.setTarget((Handler)var1);
   }
}
