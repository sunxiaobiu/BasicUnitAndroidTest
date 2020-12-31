import android.net.LocalServerSocket;
import android.net.LocalSocket;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_ar_gob_buenosaires_mascotas__1954355898 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(LocalServerSocket.class);
      LocalSocket var2 = ((LocalServerSocket)var1).accept();
   }
}
