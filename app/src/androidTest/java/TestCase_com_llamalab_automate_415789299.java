import android.os.ParcelFileDescriptor;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_llamalab_automate_415789299 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ParcelFileDescriptor.class);
      String var1 = "android";
      ((ParcelFileDescriptor)var2).closeWithError(var1);
   }
}
