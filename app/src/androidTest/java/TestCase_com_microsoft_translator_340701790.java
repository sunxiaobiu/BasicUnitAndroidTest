import android.hardware.Camera.ShutterCallback;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_microsoft_translator_340701790 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ShutterCallback.class);
      ((ShutterCallback)var1).onShutter();
   }
}
