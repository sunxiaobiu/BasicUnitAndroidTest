import android.os.ParcelFileDescriptor;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_air_com_gamegos_solitale_1072756429 {
   @Test
   public void testCase() throws Exception {
      Object var3 = EasyMock.createMock(ParcelFileDescriptor.class);
      long var1 = ((ParcelFileDescriptor)var3).getStatSize();
   }
}
