import android.os.ParcelFileDescriptor;
import android.os.ParcelFileDescriptor.AutoCloseInputStream;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_com_akkad_rullo_493795085 {
   @Test
   public void testCase() throws Exception {
      Object var2 = EasyMock.createMock(ParcelFileDescriptor.class);
      AutoCloseInputStream var1 = new AutoCloseInputStream((ParcelFileDescriptor)var2);
      var1.close();
   }
}
