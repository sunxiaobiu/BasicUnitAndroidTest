import android.os.ParcelFileDescriptor.AutoCloseOutputStream;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_amazon_mp3__185834724 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(AutoCloseOutputStream.class);
      ((AutoCloseOutputStream)var1).close();
   }
}
