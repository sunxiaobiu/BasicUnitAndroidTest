import android.os.ParcelFileDescriptor;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_6191546028C21779EAA699CF303977F093D48A2256D8EE52A39F5C3C7A4FDB6E_1350821603 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ParcelFileDescriptor.class);
      ((ParcelFileDescriptor)var1).checkError();
   }
}
