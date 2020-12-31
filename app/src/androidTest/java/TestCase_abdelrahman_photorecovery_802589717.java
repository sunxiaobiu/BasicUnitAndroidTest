import android.os.Handler;
import android.os.Message;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_abdelrahman_photorecovery_802589717 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(Handler.class);
      Handler var1 = new Handler();
      Object var3 = EasyMock.createMock(Message.class);
      ((Handler)var2).sendMessage((Message)var3);
   }
}
