import android.media.ExifInterface;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_aang_ind_reefal_520604911 {
   @Test
   public void testCase() throws Exception {
      Object var1 = EasyMock.createMock(ExifInterface.class);
      int var2 = ((ExifInterface)var1).getAttributeInt("Orientation", 1);
   }
}
