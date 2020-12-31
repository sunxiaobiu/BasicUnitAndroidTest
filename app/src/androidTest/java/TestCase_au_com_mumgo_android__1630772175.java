import android.os.Handler;
import android.os.Message;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_au_com_mumgo_android__1630772175 {
   @Test
   public void testCase() throws Exception {
      Handler var2 = new Handler();
      Object var1 = EasyMock.createMock(Message.class);
      var2.dispatchMessage((Message)var1);
   }
}
