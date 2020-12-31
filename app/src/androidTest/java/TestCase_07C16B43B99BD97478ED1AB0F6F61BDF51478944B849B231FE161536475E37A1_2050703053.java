import android.net.Uri;
import android.provider.MediaStore;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_07C16B43B99BD97478ED1AB0F6F61BDF51478944B849B231FE161536475E37A1_2050703053 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(Uri.class);
      Uri var1 = MediaStore.setRequireOriginal((Uri)var0);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
