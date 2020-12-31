import android.support.v4.text.util.LinkifyCompat;
import android.widget.TextView;
import androidx.test.runner.AndroidJUnit4;
import org.easymock.EasyMock;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class TestCase_com_brother_ptouch_designandprint_1540630458 {
   public static void testCase() throws Exception {
      Object var0 = EasyMock.createMock(TextView.class);
      LinkifyCompat.addLinks((TextView)var0, 1);
   }

   @Test
   public void staticTest() throws Exception {
      testCase();
   }
}
