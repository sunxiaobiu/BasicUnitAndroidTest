import android.inputmethodservice.Keyboard;
import android.inputmethodservice.KeyboardView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_be_grapher_290913028 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(KeyboardView.class);
      Keyboard var2 = ((KeyboardView)var1).getKeyboard();
      int var3 = var2.getHeight();
   }
}
