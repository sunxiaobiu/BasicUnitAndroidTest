import android.inputmethodservice.KeyboardView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_be_grapher__833619408 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(KeyboardView.class);
      boolean var1 = true;
      ((KeyboardView)var2).setPreviewEnabled(var1);
   }
}
